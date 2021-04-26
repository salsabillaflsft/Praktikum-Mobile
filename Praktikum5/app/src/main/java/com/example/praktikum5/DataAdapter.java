package com.example.praktikum5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
    private List<DataModel> list;
    private ItemClickListener clickListener;


    public DataAdapter(List<DataModel> list, ItemClickListener clickListener) {
        this.list = list;
        this.clickListener  = clickListener;

    }

    @NonNull
    @Override
    public DataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleTextView.setText(list.get(position).getName());
        holder.detailTextView.setText(list.get(position).getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView detailTextView;

        public MyViewHolder(View view) {
            super(view);
            titleTextView = view.findViewById(R.id.name);
            detailTextView = view.findViewById(R.id.details);
        }

    }

    public interface ItemClickListener {
        public void onItemClick(DataModel dataModel);
    }
}
