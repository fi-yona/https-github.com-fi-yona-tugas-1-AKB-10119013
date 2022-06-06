package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 22-04-2022

public class RegistrationActivity extends AppCompatActivity {

    private Button btn_kembali_login, btn_daftarkan;
    private EditText input_username_regis, input_password_regis;
    private String data_username, data_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btn_kembali_login = findViewById(R.id.btn_kembali_login);

        btn_kembali_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikl = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(ikl);
            }
        });

        initView();
        setData();
    }

    public void initView(){
        btn_daftarkan = findViewById(R.id.btn_daftarkan);
    }

    public void setData(){
        btn_daftarkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}