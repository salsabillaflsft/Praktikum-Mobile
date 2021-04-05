package com.example.praktikum2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNama,tvNIM,tvHuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_nama);
        tvNIM = findViewById(R.id.tv_nim);
        tvHuruf = findViewById(R.id.tv_huruf);

        Bundle b = getIntent().getExtras();
        String nama = b.getString("nama");
        String nim = b.getString("nim");
        String huruf = b.getString("nilai");
        tvNama.setText(nama);
        tvNIM.setText(nim);
        tvHuruf.setText(huruf);

    }

}