package com.example.furniture_rysbekov.ui.home;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniture_rysbekov.R;
import com.example.furniture_rysbekov.databinding.ItemCategoryBinding;
import com.example.furniture_rysbekov.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private List<CategoryModel> main_list = new ArrayList<>();

    public void setMain_list(List<CategoryModel> main_list){
        this.main_list = main_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCategoryBinding binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(main_list.get(position));
    }

    @Override
    public int getItemCount() {
        return main_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemCategoryBinding binding;

        public ViewHolder(@NonNull ItemCategoryBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(CategoryModel categoryModel) {
            binding.titleCategory.setText(categoryModel.getTitle());
            binding.imageCategory.setImageResource(categoryModel.getImage());

            itemView.setOnClickListener(v -> {
                NavController navController = Navigation.findNavController(binding.getRoot());
                switch (categoryModel.getTitle()) {
                    case "Для спальни":
                        navController.navigate(R.id.action_navigation_home_to_navigation_bed_room);
                        break;
                    case "Для гостинной":
                        navController.navigate(R.id.action_navigation_home_to_navigation_zal);
                        break;
                    case "Кухонная мебель":
                        navController.navigate(R.id.action_navigation_home_to_kitchenFragment);
                        break;

                    case "Садовая мебель":
                        navController.navigate(R.id.action_navigation_home_to_gardenFragment);
                        break;
                    case "Мебель для прихожей":
                        navController.navigate(R.id.action_navigation_home_to_prihojiyFragment);
                        break;
                    default:
                        break;
                }
            });
        }
    }

}