package com.example.mahasiswapc.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btntambah,btnkurang,btnkali,btnbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntambah = findViewById(R.id.btn_tambah);
        btnkurang = findViewById(R.id.btn_kurang);
        btnkali = findViewById(R.id.btn_kali);
        btnbagi = findViewById(R.id.btn_bagi);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itambah = new Intent(getApplicationContext(),tambah.class);
                startActivity(itambah);
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikurang = new Intent(getApplicationContext(),kurang.class);
                startActivity(ikurang);
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikali = new Intent(getApplicationContext(),kali.class);
                startActivity(ikali);
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ibagi = new Intent(getApplicationContext(),bagi.class);
                startActivity(ibagi);
            }
        });


    }
}
