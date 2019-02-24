package com.example.mahasiswapc.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kali extends AppCompatActivity {
    private Button  btnKali,btnkembali;
    private TextView tvHasil;
    private EditText etPanjang, etLebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);
        btnKali = findViewById(R.id.btn_kali);
        btnkembali = findViewById(R.id.btn_kembali);
        tvHasil = findViewById(R.id.tv_hasil);
        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);


        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sPanjang = etPanjang.getText().toString();
                    String sLebar = etLebar.getText().toString();

                    double panjang = Double.parseDouble(sPanjang);
                    double lebar = Double.parseDouble(sLebar);
                    double kali = panjang * lebar;


                    String sKali = String.valueOf(kali);
                    tvHasil.setText(sKali);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikembali = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ikembali);
            }
        });
    }
}
