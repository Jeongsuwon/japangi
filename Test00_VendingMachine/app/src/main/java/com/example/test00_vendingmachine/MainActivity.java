package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn_change;
    ArrayList<DrinkDTO> drinkdto = new ArrayList<>();
    MoneyDTO moneydto = new MoneyDTO();







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_change = findViewById(R.id.btn_change);


        drinkdto.add(new DrinkDTO("콜라",800,10));
        moneydto.Money=10000;


        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("drinkname",drinkdto.get(0).name);
                intent.putExtra("drinkprice",drinkdto.get(0).price);
                intent.putExtra("drinkcnt",drinkdto.get(0).cnt);

                startActivity(intent);

            }
        });





    }
}