package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 21-04-2022

public class SplashScreenActivity extends AppCompatActivity {

    private Button btn_ayo_mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //inisialisasi
        btn_ayo_mulai = findViewById(R.id.btn_ayo_mulai);

        btn_ayo_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplashScreenActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        });
    }

}