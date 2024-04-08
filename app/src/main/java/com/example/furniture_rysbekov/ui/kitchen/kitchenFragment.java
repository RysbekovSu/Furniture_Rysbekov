package com.example.furniture_rysbekov.ui.kitchen;

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
import com.example.furniture_rysbekov.databinding.FragmentKitchenBinding;
import com.example.furniture_rysbekov.databinding.FragmentZalBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;
import com.example.furniture_rysbekov.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;
import java.util.List;

public class kitchenFragment extends Fragment {

    private FragmentKitchenBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;
    NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.set_list(list_zal);
        binding.rVZALROOM.setAdapter(adapter);
        return root;
    }

    public void createList(){
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));
        list_zal.add(new FurnitureModel("kitchen","Кухонная фурнитура Premium","68000","Гарнитур кухонный: Преобразите свою кухню с нашими гарнитурами! Удобная организация пространства, стильный дизайн и высокая функциональность - всё это предлагает наша мебель для кухни. Позвольте себе насладиться уютом и практичностью в каждом приготовленном блюде!", R.drawable.kitschen));

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