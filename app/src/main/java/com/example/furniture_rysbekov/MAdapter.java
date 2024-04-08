package com.example.furniture_rysbekov;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniture_rysbekov.databinding.ItemFurnitureBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class MAdapter extends RecyclerView.Adapter<MAdapter.ViewHolder> {
    ItemFurnitureBinding binding;
    ArrayList<FurnitureModel> list_zal = new ArrayList<>();
    NavController navController;
    @NonNull
    @Override
    public MAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemFurnitureBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list_zal.get(position));

    }




    public MAdapter() {
    }

    @Override
    public int getItemCount() {
        return list_zal.size();
    }
    public void  set_list(List<FurnitureModel> main_list){
        this.list_zal = list_zal;
    }



    public  class ViewHolder extends  RecyclerView.ViewHolder{
        ItemFurnitureBinding itemFurnitureBinding;
        public  ViewHolder(@NonNull ItemFurnitureBinding itemView){
            super(itemView.getRoot());
            binding =itemView;
        }

        public void onBind(FurnitureModel furnitureModel) {
            binding.titleCard.setText(furnitureModel.getTitle());
            binding.priceCard.setText(furnitureModel.getPrice());
            binding.descriptionCard.setText(furnitureModel.getDescription());
            binding.imageCard.setImageResource(furnitureModel.getImgInt());

            binding.btnDone.setOnClickListener(v -> {
                list_zal.add(furnitureModel);
                navController = Navigation.findNavController((Activity)itemView.getContext(),
                            R.id.nav_host_fragment_activity_main);

                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("favourite", list_zal);
                navController.navigate(R.id.action_navigation_home_to_navigation_bed_room);
            });
        }
        }
}
