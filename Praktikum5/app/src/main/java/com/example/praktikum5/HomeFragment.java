package com.example.praktikum5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements DataAdapter.ItemClickListener{

    private RecyclerView recyclerView;
    private ArrayList<DataModel> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_home, container, false);

        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DataAdapter adapter = new DataAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {
        list.add(new DataModel("coba","aaaa"));

    }

    @Override
    public void onItemClick(DataModel dataModel) {
        Fragment fragment = DetailFragment.newInstance(dataModel.getName());


        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        transaction.hide(getActivity().getSupportFragmentManager().findFragmentByTag("main_fragment"));
        transaction.add(R.id.main_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}