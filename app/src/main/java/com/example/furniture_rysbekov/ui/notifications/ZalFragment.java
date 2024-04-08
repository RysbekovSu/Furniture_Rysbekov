package com.example.furniture_rysbekov.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_rysbekov.MAdapter;
import com.example.furniture_rysbekov.R;
import com.example.furniture_rysbekov.databinding.FragmentZalBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {

    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;
    NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.set_list(list_zal);
        binding.rVZALROOM.setAdapter(adapter);
        return root;
    }

    public void createList(){
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));
        list_zal.add(new FurnitureModel("zal","Мягкая тетрадь себель имба","2800","Италия", R.drawable.ic_dashboard_black_24dp));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_zal_to_navigation_home);
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}