package com.ag.mytouristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {


    private   TextView textView;
    private EditText editText1,editText2;
    private FirebaseAuth auth;
    CheckBox checkBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        textView=findViewById(R.id.no_acc);
        Button btn;
        btn=findViewById(R.id.loginbtn);
        auth=FirebaseAuth.getInstance();
        editText1=findViewById(R.id.email_login);
        editText2=findViewById(R.id.login_pass);
        checkBox=findViewById(R.id.remember_me);
        getSupportActionBar().hide();


        SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
        String cb=preferences.getString("remember","");

        if (cb.equals("true")){

            Intent intent=new Intent(LogInActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if (cb.equals("false")){


        }




        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LogInActivity.this,SignUp.class);
                startActivity(intent);
            }
        });

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              // Intent intent1=new Intent(LogInActivity.this,SignUp.class);

               String email = editText1.getText().toString();
               String pass = editText2.getText().toString();
               if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                   if (!pass.isEmpty()) {

                       auth.signInWithEmailAndPassword(email, pass)
                               .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                   @Override
                                   public void onSuccess(AuthResult authResult) {
                                       Toast.makeText(LogInActivity.this, "LogIn Successful", Toast.LENGTH_SHORT).show();
                                       startActivity(new Intent(LogInActivity.this, MainActivity.class));
                                       finish();
                                   }
                               }).addOnFailureListener(new OnFailureListener() {
                           @Override
                           public void onFailure(@NonNull Exception e) {
                               Toast.makeText(LogInActivity.this, "LogIn Failed", Toast.LENGTH_SHORT).show();
                           }
                       });
                   }
               } else {
                   editText2.setError("Enter password");
               }
               if (email.isEmpty()){
                   editText1.setError("Enter Emailid");
               }
               else {
                   editText1.setError("please Enter valid email");

               }
           }
      });

       checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (buttonView.isChecked()){


                   SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
                   SharedPreferences.Editor editor=preferences.edit();
                   editor.putString("remember","true");
                   editor.apply();

               }
               else if (!buttonView.isChecked()){
                   SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
                   SharedPreferences.Editor editor=preferences.edit();
                   editor.putString("remember","false");
                   editor.apply();
               }
           }
       });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }
}