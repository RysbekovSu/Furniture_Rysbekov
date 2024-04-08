package com.example.furniture_rysbekov.ui.garden;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_rysbekov.MAdapter;
import com.example.furniture_rysbekov.R;
import com.example.furniture_rysbekov.databinding.FragmentGardenBinding;
import com.example.furniture_rysbekov.databinding.FragmentZalBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;
import com.example.furniture_rysbekov.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    private FragmentGardenBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;
    NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGardenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.set_list(list_zal);
        binding.rVZALROOM.setAdapter(adapter);
        return root;
    }

    public void createList(){
        list_zal.add(new FurnitureModel("Garden","Мебель для сада","3400","Мебель для сада: Превратите ваш сад в удивительное место для отдыха и развлечений с нашей коллекцией мебели для сада! От прекрасных ланаев до уютных кресел и столов, наша мебель для сада поможет вам создать идеальную атмосферу для отдыха на свежем воздухе. Выбирайте из разнообразных стилей и материалов, чтобы подчеркнуть уникальный характер вашего сада. Наслаждайтесь каждым моментом на открытом воздухе вместе с нами!" +
                "\n", R.drawable.garden));
        list_zal.add(new FurnitureModel("Garden","Мебель для сада","3400","Мебель для сада: Превратите ваш сад в удивительное место для отдыха и развлечений с нашей коллекцией мебели для сада! От прекрасных ланаев до уютных кресел и столов, наша мебель для сада поможет вам создать идеальную атмосферу для отдыха на свежем воздухе. Выбирайте из разнообразных стилей и материалов, чтобы подчеркнуть уникальный характер вашего сада. Наслаждайтесь каждым моментом на открытом воздухе вместе с нами!" +
                "\n", R.drawable.garden));
        list_zal.add(new FurnitureModel("Garden","Мебель для сада","3400","Мебель для сада: Превратите ваш сад в удивительное место для отдыха и развлечений с нашей коллекцией мебели для сада! От прекрасных ланаев до уютных кресел и столов, наша мебель для сада поможет вам создать идеальную атмосферу для отдыха на свежем воздухе. Выбирайте из разнообразных стилей и материалов, чтобы подчеркнуть уникальный характер вашего сада. Наслаждайтесь каждым моментом на открытом воздухе вместе с нами!" +
                "\n", R.drawable.garden));
        list_zal.add(new FurnitureModel("Garden","Мебель для сада","3400","Мебель для сада: Превратите ваш сад в удивительное место для отдыха и развлечений с нашей коллекцией мебели для сада! От прекрасных ланаев до уютных кресел и столов, наша мебель для сада поможет вам создать идеальную атмосферу для отдыха на свежем воздухе. Выбирайте из разнообразных стилей и материалов, чтобы подчеркнуть уникальный характер вашего сада. Наслаждайтесь каждым моментом на открытом воздухе вместе с нами!" +
                "\n", R.drawable.garden));
        list_zal.add(new FurnitureModel("Garden","Мебель для сада","3400","Мебель для сада: Превратите ваш сад в удивительное место для отдыха и развлечений с нашей коллекцией мебели для сада! От прекрасных ланаев до уютных кресел и столов, наша мебель для сада поможет вам создать идеальную атмосферу для отдыха на свежем воздухе. Выбирайте из разнообразных стилей и материалов, чтобы подчеркнуть уникальный характер вашего сада. Наслаждайтесь каждым моментом на открытом воздухе вместе с нами!" +
                "\n", R.drawable.garden));
        list_zal.add(new FurnitureModel("Garden","Мебель для сада","3400","Мебель для сада: Превратите ваш сад в удивительное место для отдыха и развлечений с нашей коллекцией мебели для сада! От прекрасных ланаев до уютных кресел и столов, наша мебель для сада поможет вам создать идеальную атмосферу для отдыха на свежем воздухе. Выбирайте из разнообразных стилей и материалов, чтобы подчеркнуть уникальный характер вашего сада. Наслаждайтесь каждым моментом на открытом воздухе вместе с нами!" +
                "\n", R.drawable.garden));
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