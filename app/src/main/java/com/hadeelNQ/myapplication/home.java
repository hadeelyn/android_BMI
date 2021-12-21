package com.hadeelNQ.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.hadeelNQ.myapplication.ui.BMIRecordAdapter;
import com.hadeelNQ.myapplication.ui.FireBaseConnect;
import com.hadeelNQ.myapplication.ui.User;

public class home extends AppCompatActivity {
    static home instance;
    TextView welcome_name,logout;
    EditText status;
    Button view_food,add_food,add_record;
    RecyclerView records_rv;
    public static BMIRecordAdapter adapter;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
user=new User();
        setContentView(R.layout.activity_home);
        records_rv=findViewById(R.id.records_rv);
        //records_rv.setLayoutManager(new LinearLayoutManager());
        adapter=new BMIRecordAdapter(user,this);
        records_rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        welcome_name=findViewById(R.id.welcome_name);
        logout=findViewById(R.id.logout);
        status=findViewById(R.id.status);
        add_food=findViewById(R.id.add_food);
        add_record=findViewById(R.id.add_record);
        view_food=findViewById(R.id.view_food);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
        add_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFood();
            }
        });
        add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addRecord();
            }
        });

        view_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFood();
            }
        });
        records_rv.setLayoutManager(new LinearLayoutManager(this));
        adapter= new BMIRecordAdapter(User.user,this);
        records_rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        checkBMIChange();
    }
    public void addFood(View view){
        Intent z=new Intent(home.this,AddFood.class);
        startActivity(z);
    }


    public void viewFood(View view) {
        Intent intent = new Intent(this, FoodList.class);
        startActivity(intent);
    }
    public void addRecord(View view) {
        Intent intent = new Intent(this, newRecord.class);
        startActivity(intent);
    }
    public void logout(View view) {
        FireBaseConnect.logout();
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);

    }
    public static void logout(){

    }

    public static void addRecord(){

    }

    public static void viewFood(){

    }

    public static void addFood(){

    }
    public static void checkBMIChange(){
        if(instance==null)return;
        instance.adapter.notifyDataSetChanged();
        instance.status.setText(User.user.getMessage());
        instance.welcome_name.setText("hi, "+User.user.getName());
    }
    protected void onResume(){
        super.onResume();
        checkBMIChange();
    }

}