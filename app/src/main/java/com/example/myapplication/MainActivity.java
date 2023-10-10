package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void OnButtonChangeTextClick(View view) {

        this.tvMain.setText("Labas pasauli!");
    }

    public void OnButtonChangeTextColorClick(View view) {
        this.tvMain.setTextColor(Color.parseColor("#0F9D58"));
    }


    //Kažkokia papildoma funkcija mes gražinsime
}