package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 22-04-2022

public class Main2Activity extends AppCompatActivity {

    private Button btn_masuk;
    private Button btn_registrasi;
    private EditText input_username_login, input_password_login;
    private String data_username, data_password;
    public String get_username, get_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();
        setData();
    }

    public void initView(){
        btn_masuk = findViewById(R.id.btn_masuk);
        btn_registrasi = findViewById(R.id.btn_registrasi);
    }

    public void setData(){
        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, ScreenMenuActivity.class);
                startActivity(intent);
            }
        });

        btn_registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, ScreenRegistrasiActivity.class);
                startActivity(intent);
            }
        });

    }
}