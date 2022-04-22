package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button btn_masuk, btn_registrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_masuk = findViewById(R.id.btn_masuk);
        btn_registrasi = findViewById(R.id.btn_registrasi);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im = new Intent(Main2Activity.this, ScreenMenuActivity.class);
                startActivity(im);
            }
        });

        btn_registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(Main2Activity.this, ScreenRegistrasiActivity.class);
                startActivity(ir);
            }
        });
    }
}