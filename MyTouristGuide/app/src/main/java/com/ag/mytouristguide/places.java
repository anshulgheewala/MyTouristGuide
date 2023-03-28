package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class places extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager lm;
    grid_Adapter ad3;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        recyclerView=findViewById(R.id.places_rv);

        textView=findViewById(R.id.tvv1);
        imageView=findViewById(R.id.imgv1);

        lm=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(lm);

//        FirebaseRecyclerOptions<model> options =
//                new FirebaseRecyclerOptions.Builder<model>()
//                        .setQuery(FirebaseDatabase.getInstance().getReference().child(("mtg")).getDatabase().getReference().child("city1"), model.class)
//                        .build();
//        ad3 = new grid_Adapter(options);
        recyclerView.setAdapter(ad3);

        textView.setText(getIntent().getStringExtra("namev"));




    }


}