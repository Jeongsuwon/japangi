package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent intent = getIntent();
        String drinkname = intent.getStringExtra("drinkname");
        int drinkprice = intent.getIntExtra("drinkprice",0);
        int
       TextView tv_name=findViewById(R.id.list);


//        String cola="콜라";

//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            TextView tv = findViewById(R.id.cola);
//
//            tv.setText(cola);

    }
}