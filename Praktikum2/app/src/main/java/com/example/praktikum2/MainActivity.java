package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnHasil;
    private EditText etNama, etNIM, etIPK;
    private TextView tvHuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHasil = findViewById(R.id.btn_hasil);
        etNama = findViewById(R.id.et_nama);
        etNIM = findViewById(R.id.et_nim);
        etIPK = findViewById(R.id.et_ipk);
        tvHuruf = findViewById(R.id.tv_huruf);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!etIPK.getText().toString().equals("")){
                    double ipk = Double.parseDouble(etIPK.getText().toString());
                    String hasil = "";

                    if (ipk <= 4.00 && ipk > 3.66) {
                        hasil = "A";
                    }
                    else if (ipk <= 3.66 && ipk > 3.33) {
                        hasil = "A-";
                    }
                    else if (ipk <= 3.33 && ipk > 3.00) {
                        hasil = "B+";
                    }
                    else if (ipk <= 3.00 && ipk > 2.66) {
                        hasil = "B";
                    }
                    else if (ipk <= 2.66 && ipk > 2.33) {
                        hasil = "B-";
                    }
                    else if (ipk <= 2.33 && ipk > 2.00) {
                        hasil = "C+";
                    }
                    else if (ipk <= 2.00 && ipk > 1.66) {
                        hasil = "C";
                    }
                    else if (ipk <= 1.66 && ipk > 1.33) {
                        hasil = "C-";
                    }
                    else if (ipk <= 1.33 && ipk > 1.00) {
                        hasil = "D+";
                    }
                    else if (ipk == 1.00) {
                        hasil = "D";
                    }
                    else{
                        hasil = "E";
                    }
                    tvHuruf.setText(hasil);
                }



                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nama", etNama.getText().toString());
                i.putExtra("nim", etNIM.getText().toString());
                i.putExtra("nilai", tvHuruf.getText().toString());

                startActivity(i);
            }
        });
    }

}
