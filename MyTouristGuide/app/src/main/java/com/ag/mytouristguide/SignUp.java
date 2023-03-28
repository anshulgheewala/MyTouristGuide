package com.ag.mytouristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    Button button1;
    private FirebaseAuth auth;
    private EditText editText1,editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        auth=FirebaseAuth.getInstance();
        editText1=findViewById(R.id.email_signup);
        editText2=findViewById(R.id.signup_password);
        button1=findViewById(R.id.Register_btn);
        getSupportActionBar().hide();



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String user=editText1.getText().toString().trim();
                String pass=editText2.getText().toString().trim();

                if (user.isEmpty()){
                    editText1.setError("Please Enter Valid E-mail Id");
                }
                if (pass.isEmpty()){
                    editText2.setError("Please enter valid password");
                }else {
                    auth.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(SignUp.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                //startActivity(new Intent(SignUp.this,LogInActivity.class));
                                Intent intent1=new Intent(SignUp.this,LogInActivity.class);
                                startActivity(intent1);

                            }
                            else {
                                Toast.makeText(SignUp.this, "SignUp Failed" +task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });


    }
}