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

public class adapter2 extends RecyclerView.Adapter<adapter2.ViewHolder> {
    ArrayList<model> list;
    Context context;

    public adapter2(ArrayList<model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.suggestions,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model m = list.get(position);
        holder.visit.setText(m.getVisit());
        Glide.with(holder.icon2.getContext()).load(m.getImage()).placeholder(com.firebase.ui.database.R.drawable.googleg_disabled_color_18).into(holder.icon2);
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,places.class);
                intent.putExtra("namev",m.getNamev());
//                intent.putExtra("age",m.getAge());
//                intent.putExtra("email",m.getEmail());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icon2;
        TextView visit;
        CardView cv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon2=itemView.findViewById(R.id.vpi);
            visit=itemView.findViewById(R.id.visiting);
            cv=itemView.findViewById(R.id.visiting_a);

        }
    }

}