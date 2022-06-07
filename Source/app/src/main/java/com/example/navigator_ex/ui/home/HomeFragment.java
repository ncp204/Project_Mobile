package com.example.navigator_ex.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator_ex.HomeVerAdapter;
import com.example.navigator_ex.HomeVerModel;
import com.example.navigator_ex.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeVerticalRec;
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.fragment_home, container, false);
       homeVerticalRec = root.findViewById(R.id.itemPizzaN);

       homeVerModelList= new ArrayList<>();

       homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "45 000"));

        homeVerAdapter = new HomeVerAdapter(getActivity(), homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;
    }
}