package com.example.praktikum2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNama,tvNIM,tvIPK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_nama);
        tvNIM = findViewById(R.id.tv_nim);
        tvIPK = findViewById(R.id.tv_ipk);

        Bundle b = getIntent().getExtras();
        String nama = b.getString("nama");
        String nim = b.getString("nim");
        String nilai = b.getString("nilai");
        tvNama.setText(nama);
        tvNIM.setText(nim);
        tvIPK.setText(nilai);

    }

}