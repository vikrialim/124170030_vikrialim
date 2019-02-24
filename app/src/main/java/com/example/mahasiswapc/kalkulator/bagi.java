package com.example.mahasiswapc.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bagi extends AppCompatActivity {
    private Button  btnBagi,btnkembali;
    private TextView tvHasil;
    private EditText etPanjang, etLebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagi);
        btnBagi = findViewById(R.id.btn_bagi);
        tvHasil = findViewById(R.id.tv_hasil);
        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);
        btnkembali  = findViewById(R.id.btn_kembali);

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sPanjang = etPanjang.getText().toString();
                    String sLebar = etLebar.getText().toString();

                    double panjang = Double.parseDouble(sPanjang);
                    double lebar = Double.parseDouble(sLebar);
                    double bagi = panjang / lebar;


                    String sBagi = String.valueOf(bagi);
                    tvHasil.setText(sBagi);
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
