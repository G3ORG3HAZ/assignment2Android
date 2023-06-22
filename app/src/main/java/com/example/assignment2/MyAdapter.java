package com.example.assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    Context context;
    List<Country> items;

    public MyAdapter(Context context, List<Country> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.button1.setText(items.get(position).getOption1());
        holder.button2.setText(items.get(position).getOption2());
        holder.button3.setText(items.get(position).getOption3());
        holder.button4.setText(items.get(position).getOption4());
        holder.imageView.setImageResource(items.get(position).getFlagImageResourceId());

        //send the name of the country to the MyViewHolder.java
        holder.correctAnswer = items.get(position).getName();
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
}
