package com.ag.mytouristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class vhr extends AppCompatActivity {
    RecyclerView recyclerView2;
    adapter2 ad2;
    TextView textView;
    ImageView imageView;
    ArrayList<model>list2;
    Context context;

    FirebaseDatabase firebaseDatabase;
    //private final DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vhr);
        getSupportActionBar().hide();



        recyclerView2 = findViewById(R.id.rv2);
        textView=findViewById(R.id.abc);
        imageView=findViewById(R.id.ivv);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        list2=new ArrayList<>();
        firebaseDatabase=FirebaseDatabase.getInstance();
        ad2=new adapter2(list2,getApplicationContext());

        recyclerView2.setAdapter(ad2);






        textView.setText(getIntent().getStringExtra("visitingplaces"));



        firebaseDatabase.getReference().child("info").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds:snapshot.getChildren()){
                    model m=ds.getValue(model.class);
                    list2.add(m);
                }
                ad2.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

//        Intent intent=getIntent();
//        String b=intent.getExtras().getString("VisitingPlaces");


//        textView.setText(""+b);
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        //ad2.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
       // ad2.stopListening();
    }
}