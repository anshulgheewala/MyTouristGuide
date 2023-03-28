package com.ag.mytouristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class




MainActivity extends AppCompatActivity {


    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9;
    TextView tv;
    private Object Menu;
    RecyclerView recyclerView;
    adapter ad;
    Context context;
    ArrayList<model>list;
    FirebaseDatabase firebaseDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        list=new ArrayList<>();
        firebaseDatabase=FirebaseDatabase.getInstance();
        ad=new adapter(list,getApplicationContext());

        recyclerView.setAdapter(ad);

        firebaseDatabase.getReference().child("mtg").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds:snapshot.getChildren()){
                    model m=ds.getValue(model.class);
                    list.add(m);
                }
                ad.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });









//        ad.startListening();







//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//               anim();
//
//            }
//        });



//        cardView1=findViewById(R.id.cv1);
//        cardView2=findViewById(R.id.cv2);
//        cardView3=findViewById(R.id.cv3);
//        cardView4=findViewById(R.id.cv4);
//        cardView5=findViewById(R.id.cv5);
//        cardView6=findViewById(R.id.cv6);
//        cardView7=findViewById(R.id.cv7);
//        cardView8=findViewById(R.id.cv8);
//        cardView9=findViewById(R.id.cv9);
//
//
//
//
//
//
//
//        cardView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,Gandhinagar.class);
//                startActivity(intent);
//            }
//        });
//        cardView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,Ahmedabad.class);
//                startActivity(intent);
//            }
//        });
//        cardView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,Vadodra.class);
//                startActivity(intent);
//            }
//        });
//        cardView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,Kutch.class);
//                startActivity(intent);
//            }
//        });
//        cardView5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,junagadh.class);
//                startActivity(intent);
//            }
//        });
//        cardView6.setOnClickListener(new View.OnClickListener() {

//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,narmada.class);
//                startActivity(intent);
//            }
//        });
//        cardView7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,dwarka.class);
//                startActivity(intent);
//            }
//        });
//        cardView8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,patan.class);
//                startActivity(intent);
//            }
//        });
//        cardView9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,Mehsana.class);
//                startActivity(intent);
//            }
//        });



    }


    public void anim(){
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animate);
//        cardView1.startAnimation(animation);
//        cardView2.startAnimation(animation);
//        cardView3.startAnimation(animation);
//        cardView4.startAnimation(animation);
//        cardView5.startAnimation(animation);
//        cardView6.startAnimation(animation);
//        cardView7.startAnimation(animation);
//        cardView8.startAnimation(animation);
//        cardView9.startAnimation(animation);

    }
    protected void onStart(){
        super.onStart();
        //anim();



    }

    @Override
    protected void onStop() {
        super.onStop();
        //ad.stopListening();
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();

        if (item_id==R.id.aboutus){

            Intent intent=new Intent(MainActivity.this,AboutUs.class);
            startActivity(intent);

        }
        else if (item_id==R.id.signout){
            SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
            SharedPreferences.Editor editor=preferences.edit();
            editor.putString("remember","false");
            editor.apply();
            Intent intent=new Intent(MainActivity.this,LogInActivity.class);
            startActivity(intent);

        }
        else if (item_id==R.id.exit){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }
        else if (item_id==R.id.route){
            Intent intent =new Intent(MainActivity.this,Route.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);


    }
}