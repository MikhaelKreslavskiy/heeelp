package com.example.mike.med2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mike.med2.viewholders.ViewHolder;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String>messages;
    LayoutInflater inflater;

    public DataAdapter(Context context, ArrayList<String> messages) {
        this.messages = messages;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View view=inflater.inflate(R.layout.item_layout,viewGroup,false);
      return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String msg=messages.get(i);
        viewHolder.message.setText(msg);

    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
