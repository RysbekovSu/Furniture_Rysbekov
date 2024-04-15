package com.example.furniture_rysbekov.ui.prihojiy;

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
import com.example.furniture_rysbekov.databinding.FragmentPrihojiyBinding;
import com.example.furniture_rysbekov.databinding.FragmentZalBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class PrihojiyFragment extends Fragment {

    private FragmentPrihojiyBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;
    NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPrihojiyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.set_list(list_zal);
        binding.rVZALROOM.setAdapter(adapter);
        return root;
    }

    public void createList(){
        list_zal.add(new FurnitureModel("hallaway","Гарнитура для прихожей Lux","36000","Мебель для прихожей: Добро пожаловать домой! Наши мебельные решения для прихожей помогут вам создать идеальное приветственное пространство. Отличное хранение, стильный дизайн и функциональность делают нашу мебель неотъемлемой частью вашего интерьера. Придайте своему дому уют и порядок с нами!", R.drawable.photo_00_iprihojaya));
        list_zal.add(new FurnitureModel("hallaway","Гарнитура для прихожей Lux","36000","Мебель для прихожей: Добро пожаловать домой! Наши мебельные решения для прихожей помогут вам создать идеальное приветственное пространство. Отличное хранение, стильный дизайн и функциональность делают нашу мебель неотъемлемой частью вашего интерьера. Придайте своему дому уют и порядок с нами!", R.drawable.photo_00_iprihojaya));
        list_zal.add(new FurnitureModel("hallaway","Гарнитура для прихожей Lux","36000","Мебель для прихожей: Добро пожаловать домой! Наши мебельные решения для прихожей помогут вам создать идеальное приветственное пространство. Отличное хранение, стильный дизайн и функциональность делают нашу мебель неотъемлемой частью вашего интерьера. Придайте своему дому уют и порядок с нами!", R.drawable.photo_00_iprihojaya));
        list_zal.add(new FurnitureModel("hallaway","Гарнитура для прихожей Lux","36000","Мебель для прихожей: Добро пожаловать домой! Наши мебельные решения для прихожей помогут вам создать идеальное приветственное пространство. Отличное хранение, стильный дизайн и функциональность делают нашу мебель неотъемлемой частью вашего интерьера. Придайте своему дому уют и порядок с нами!", R.drawable.photo_00_iprihojaya));
        list_zal.add(new FurnitureModel("hallaway","Гарнитура для прихожей Lux","36000","Мебель для прихожей: Добро пожаловать домой! Наши мебельные решения для прихожей помогут вам создать идеальное приветственное пространство. Отличное хранение, стильный дизайн и функциональность делают нашу мебель неотъемлемой частью вашего интерьера. Придайте своему дому уют и порядок с нами!", R.drawable.photo_00_iprihojaya));
        list_zal.add(new FurnitureModel("hallaway","Гарнитура для прихожей Lux","36000","Мебель для прихожей: Добро пожаловать домой! Наши мебельные решения для прихожей помогут вам создать идеальное приветственное пространство. Отличное хранение, стильный дизайн и функциональность делают нашу мебель неотъемлемой частью вашего интерьера. Придайте своему дому уют и порядок с нами!", R.drawable.photo_00_iprihojaya));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_prihojiyFragment_to_navigation_home);
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}