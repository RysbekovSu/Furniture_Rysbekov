package com.example.furniture_rysbekov.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_rysbekov.MAdapter;
import com.example.furniture_rysbekov.R;
import com.example.furniture_rysbekov.databinding.FragmentBedRoomBinding;
import com.example.furniture_rysbekov.databinding.FragmentZalBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;
import com.example.furniture_rysbekov.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;
import java.util.List;

public class BedRoomFragment extends Fragment {

    private FragmentBedRoomBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;
    NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.set_list(list_zal);
        binding.rVZALROOM.setAdapter(adapter);
        return root;
    }

    public void createList(){
        list_zal.add(new FurnitureModel("bedRoom","Кровать Premium","3000","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.images));
        list_zal.add(new FurnitureModel("bedRoom","Кровать Luxury","3000","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.bed));
        list_zal.add(new FurnitureModel("bedRoom","Кровать Max","1324","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.bed2));
        list_zal.add(new FurnitureModel("bedRoom","Кровать Model","2800","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.bed3));
        list_zal.add(new FurnitureModel("bedRoom","Кровать Nice","2800","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.bed4));
        list_zal.add(new FurnitureModel("bedRoom","Кровать Premium","2800","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.bed5));
        list_zal.add(new FurnitureModel("bedRoom","Кровать Sigma","2800","Кровать: Уютное убежище для вашего сна! Погрузитесь в мир сладких снов с нашей кроватью - идеальным местом для отдыха после долгого дня. Стильные дизайны, высококачественные материалы и комфорт гарантированы!", R.drawable.images));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}