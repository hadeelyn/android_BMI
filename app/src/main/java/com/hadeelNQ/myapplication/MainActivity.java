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


public class MainActivity extends AppCompatActivity {


        EditText username, password;
        Button login;
        FirebaseAuth fAuth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initialization();
            loginListener();
            login= findViewById(R.id.login_btn);
        }


        private void initialization() {
            username = findViewById(R.id.login_user);
            password = findViewById(R.id.login_password);
            login = findViewById(R.id.login_btn);
            fAuth = FirebaseAuth.getInstance();

        }

        private void loginListener() {
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String usernamel = username.getText().toString();
                    String userpassword = password.getText().toString();
                    if (TextUtils.isEmpty(usernamel)) {
                        username.setError("username is required");
                        return;
                    }
                    if (TextUtils.isEmpty(userpassword)) {
                        password.setError("Password is required");
                        return;
                    }

                    fAuth.signInWithEmailAndPassword(usernamel, userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), home.class));
                            } else {
                                Toast.makeText(MainActivity.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

                }
            });
        }


    public void signup(View view) {

        startActivity(new Intent(getApplicationContext(), register.class));
    }
}
