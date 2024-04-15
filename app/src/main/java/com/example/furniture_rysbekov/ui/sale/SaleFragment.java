package com.example.furniture_rysbekov.ui.sale;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniture_rysbekov.MAdapter;
import com.example.furniture_rysbekov.R;
import com.example.furniture_rysbekov.databinding.FragmentSaleBinding;
import com.example.furniture_rysbekov.models.FurnitureModel;
import com.example.furniture_rysbekov.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;
import java.util.List;


public class SaleFragment extends Fragment {
    private FragmentSaleBinding binding;

    List<FurnitureModel> list_sale = new ArrayList<>();
    MAdapter adapter;
    NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.set_list(list_sale);
        binding.rVZALROOM.setAdapter(adapter);
        return root;
    }

    public void createList(){
        list_sale.add(new FurnitureModel("sale","Славянский комфорт","2000%","Этот диван сочетает в себе удобство и функциональность, став прекрасным местом для отдыха и развлечений в вашей гостиной. Его прочная рама и мягкие подушки обеспечивают идеальную поддержку и комфорт, а стильный дизайн в классическом советском стиле добавит атмосферу уюта и тепла в ваш дом.","20%", R.drawable.krov));
        list_sale.add(new FurnitureModel("sale","Славянский комфорт","4000","Этот диван сочетает в себе удобство и функциональность, став прекрасным местом для отдыха и развлечений в вашей гостиной. Его прочная рама и мягкие подушки обеспечивают идеальную поддержку и комфорт, а стильный дизайн в классическом советском стиле добавит атмосферу уюта и тепла в ваш дом.","40%", R.drawable.sale6));
        list_sale.add(new FurnitureModel("sale","Славянский комфорт","3000","Этот диван сочетает в себе удобство и функциональность, став прекрасным местом для отдыха и развлечений в вашей гостиной. Его прочная рама и мягкие подушки обеспечивают идеальную поддержку и комфорт, а стильный дизайн в классическом советском стиле добавит атмосферу уюта и тепла в ваш дом.","25%", R.drawable.sale4));
        list_sale.add(new FurnitureModel("sale","Славянский комфорт","4440","Этот диван сочетает в себе удобство и функциональность, став прекрасным местом для отдыха и развлечений в вашей гостиной. Его прочная рама и мягкие подушки обеспечивают идеальную поддержку и комфорт, а стильный дизайн в классическом советском стиле добавит атмосферу уюта и тепла в ваш дом.","35%", R.drawable.krov));
        list_sale.add(new FurnitureModel("sale","Славянский комфорт","2000","Этот диван сочетает в себе удобство и функциональность, став прекрасным местом для отдыха и развлечений в вашей гостиной. Его прочная рама и мягкие подушки обеспечивают идеальную поддержку и комфорт, а стильный дизайн в классическом советском стиле добавит атмосферу уюта и тепла в ваш дом.","36%", R.drawable.sale2jpeg));
        list_sale.add(new FurnitureModel("sale","Славянский комфорт","400","Этот диван сочетает в себе удобство и функциональность, став прекрасным местом для отдыха и развлечений в вашей гостиной. Его прочная рама и мягкие подушки обеспечивают идеальную поддержку и комфорт, а стильный дизайн в классическом советском стиле добавит атмосферу уюта и тепла в ваш дом.","87%", R.drawable.krov));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}