package com.hadeelNQ.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class FoodList extends AppCompatActivity {
    TextView changefood ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
    }
    public void backToTak(View view) {
        startActivity(new Intent(getApplicationContext() , home.class));
    }

    public void setId(String key) {
    }

        public void update(View view) {
            startActivity(new Intent(getApplicationContext() , AddFood.class));
            String name = changefood.getText().toString();
            if (LAYOUT_INFLATER_SERVICE.equals(AddFood.class)){
                changefood.setText("Edit food details");


            }



        }

}