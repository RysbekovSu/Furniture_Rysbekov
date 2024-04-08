package com.example.furniture_rysbekov.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.furniture_rysbekov.R;
import com.example.furniture_rysbekov.databinding.FragmentHomeBinding;
import com.example.furniture_rysbekov.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    List<CategoryModel> list_category = new ArrayList<>();

    CategoryAdapter adapter;

    LottieAnimationView lotty_sale, lotty_reclama;

    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Initialize RecyclerView layoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        binding.rvCatalogCategory.setLayoutManager(layoutManager);
        createlist();

        // Initialize data for the adapter

        // Initialize adapter and set data
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);

        // Set adapter to RecyclerView
        binding.rvCatalogCategory.setAdapter(adapter);

        // Set animation to LottieAnimationView
        lotty_reclama = binding.lottyReclama;
        lotty_reclama.setAnimation(R.raw.f1);

        // Set click listener to saleCardView
        binding.saleCardView.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });

        return root;
    }

    public void createlist(){
        list_category.add(new CategoryModel("Для спальни", R.drawable.ic_dashboard_black_24dp));
        list_category.add(new CategoryModel("Для гостинной", R.drawable.ic_dashboard_black_24dp));
        list_category.add(new CategoryModel("Кухонная мебель", R.drawable.ic_dashboard_black_24dp));
        list_category.add(new CategoryModel("Юношеские гарнитуры", R.drawable.ic_dashboard_black_24dp));
        list_category.add(new CategoryModel("Садовая мебель", R.drawable.ic_dashboard_black_24dp));
        list_category.add(new CategoryModel("Мебель для прихожей", R.drawable.ic_dashboard_black_24dp));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.saleCardView.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}