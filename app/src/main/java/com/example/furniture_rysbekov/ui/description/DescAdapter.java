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
    List<FurnitureModel> listD = new ArrayList<>();
    public void setListD(List<FurnitureModel> listD) {
        this.listD = listD;
    }

    @NonNull
    @Override
    public DescAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemDescCardBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(listD.get(position));

    }





    @Override
    public int getItemCount() {
        return listD.size();
    }



    public  class ViewHolder extends  RecyclerView.ViewHolder{
        public  ViewHolder(@NonNull ItemDescCardBinding itemView){
            super(itemView.getRoot());
        }

        public void onBind(FurnitureModel furnitureModel) {
            binding.nameCard.setText(furnitureModel.getTitle());
            binding.priceCard.setText(furnitureModel.getPrice());
            binding.descriptionCard.setText(furnitureModel.getDescription());
            binding.imageCard.setImageResource(furnitureModel.getImgInt());
        }
    }
}
