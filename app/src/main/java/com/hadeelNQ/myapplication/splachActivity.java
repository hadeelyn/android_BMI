package com.hadeelNQ.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class splachActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);

                }


            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    public void nextscreen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}