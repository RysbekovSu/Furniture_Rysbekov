package com.example.furniture_rysbekov.ui.description;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniture_rysbekov.databinding.ItemDescCardBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class DescAdapter extends RecyclerView.Adapter<DescAdapter.ViewHolder> {
    ItemDescCardBinding binding;
    List<FurnitureModel> list_zal = new ArrayList<>();
    NavController navController;
    @NonNull
    @Override
    public DescAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemDescCardBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list_zal.get(position));

    }





    @Override
    public int getItemCount() {
        return list_zal.size();
    }
    public void  set_list(List<FurnitureModel> Categoryin_list){
        this.list_zal = list_zal;
    }



    public  class ViewHolder extends  RecyclerView.ViewHolder{
        ItemDescCardBinding itemDescCardBinding;
        public  ViewHolder(@NonNull ItemDescCardBinding itemView){
            super(itemView.getRoot());
            binding =itemView;
        }

        public void onBind(FurnitureModel furnitureModel) {
            binding.nameCard.setText(furnitureModel.getTitle());
            binding.priceCard.setText(furnitureModel.getPrice());
            binding.descriptionCard.setText(furnitureModel.getDescription());
        }
    }
}
