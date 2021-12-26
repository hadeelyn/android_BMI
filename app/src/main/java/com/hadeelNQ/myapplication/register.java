package com.hadeelNQ.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class register extends AppCompatActivity {



        EditText name, email, password,re_password;
        Button create;
        FirebaseAuth fAuth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            initialization();
            createListener();


        }


    private void initialization() {
            name = findViewById(R.id.create_name);
            email = findViewById(R.id.create_email);
            password = findViewById(R.id.create_password);
            re_password = findViewById(R.id.create_repassword);
            create = findViewById(R.id.creat_btn);
            fAuth = FirebaseAuth.getInstance();
        }

        private void createListener() {
            create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String username = name.getText().toString();
                    String useremail = email.getText().toString();
                    String userpassword = password.getText().toString();
                    String repassword = re_password.getText().toString();

                    //to check all edittext is fill

                    if (TextUtils.isEmpty(username)) {
                        name.setError("Name is required");
                        return;
                    }
                    if (TextUtils.isEmpty(useremail)) {
                        email.setError("Email is required");
                        return;
                    }
                    if (TextUtils.isEmpty(userpassword)) {
                        password.setError("Password is required");
                        return;
                    }
                    if (TextUtils.isEmpty(repassword)) {
                        re_password.setError("re_Password is required");
                        return;
                    }

                    //register user in firebase

                    fAuth.createUserWithEmailAndPassword(useremail, userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(register.this, "user created", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), home.class));

                            } else {
                                Toast.makeText(register.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                            }


                        }
                    });


                }
            });
        }



    public void login(View view) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}