package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button btn_masuk, btn_registrasi;
    private EditText input_username_login, input_password_login;
    public String username_regis, password_regis, cek_username, cek_password, username, password;

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
        input_password_login = findViewById(R.id.input_password_regis);
        input_username_login = findViewById(R.id.input_username_regis);
    }

    public void setData(){
        Intent intent = getIntent();
        username_regis = intent.getStringExtra("username_regis");
        password_regis = intent.getStringExtra("password_regis");

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cek_username = input_username_login.getText().toString();
                cek_password = input_password_login.getText().toString();
                if(cek_username.equals(username_regis) && cek_password.equals(password_regis)){
                    Toast.makeText(Main2Activity.this, "Berhasil masuk", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Main2Activity.this, ScreenMenuActivity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(Main2Activity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
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