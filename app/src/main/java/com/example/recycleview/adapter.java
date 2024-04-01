package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {

    private ArrayList<clubmodel> clubmodels;

    public adapter(ArrayList<clubmodel> clubmodels) {
        this.clubmodels = clubmodels;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        viewholder vh = new viewholder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.viewholder holder, int position) {
        holder.namaclub.setText(clubmodels.get(position).getNameclub());
        holder.logoclub.setImageResource(clubmodels.get(position).getLogoclub());

    }

    @Override
    public int getItemCount() {
        return clubmodels.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        TextView namaclub;
        ImageView logoclub;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            namaclub = itemView.findViewById(R.id.namaclub);
            logoclub = itemView.findViewById(R.id.logo);


        }
    }
}
