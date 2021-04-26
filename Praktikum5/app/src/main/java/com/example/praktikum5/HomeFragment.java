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
        list.add(new DataModel("Bandung","3,5 jam berkendara"));
        list.add(new DataModel("Batu","7 jam berkendara"));
        list.add(new DataModel("Lembang","4 jam berkendara"));
        list.add(new DataModel("Bogor","5 jam berkendara"));
        list.add(new DataModel("Depok","3 jam berkendara"));
        list.add(new DataModel("Sewon","2,5 jam berkendara"));
        list.add(new DataModel("Semarang","3 jam berkendara"));
        list.add(new DataModel("Surabaya","6,5 jam berkendara"));
        list.add(new DataModel("Yogyakarta","3,5 jam berkendara"));
        list.add(new DataModel("Malang","5 jam berkendara"));

    }

    @Override
    public void onItemClick(DataModel dataModel) {
        Fragment fragment;
        fragment = DetailFragment.newInstance(dataModel.getName(), dataModel.getDetail());

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        transaction.hide(getActivity().getSupportFragmentManager().findFragmentById(R.id.main_frame));
       // transaction.replace(R.id.main_frame, fragment, "detail_fragment");
        transaction.add(R.id.main_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}