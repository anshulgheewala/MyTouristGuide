package com.ag.mytouristguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


import java.util.ArrayList;

public class grid_Adapter extends RecyclerView.Adapter<grid_Adapter.ViewHolder> {
    ArrayList<model> list;
    Context context;

    public grid_Adapter(ArrayList<model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.places_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model m = list.get(position);
        holder.namev.setText(m.getNamev());
        Glide.with(holder.imagev.getContext()).load(m.getImagev()).placeholder(com.firebase.ui.database.R.drawable.googleg_disabled_color_18).into(holder.imagev);
//        holder.cv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context,places.class);
//                intent.putExtra("namev",m.getNamev());
////                intent.putExtra("age",m.getAge());
////                intent.putExtra("email",m.getEmail());
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imagev;
        TextView namev;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagev=itemView.findViewById(R.id.imgv1);
            namev=itemView.findViewById(R.id.tvv1);
        }
    }

}