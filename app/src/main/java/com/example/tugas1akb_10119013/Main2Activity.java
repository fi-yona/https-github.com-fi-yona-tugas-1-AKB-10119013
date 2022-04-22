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

    private Button btn_masuk, btn_registrasi;
    private EditText input_username_login, input_password_login;
    public String data_username, data_password, cek_username, cek_password;

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
        Intent intent = getIntent();
        data_username = intent.getStringExtra("username");
        data_password = intent.getStringExtra("password");
        //cek_username = input_username_login.getText().toString();
        //cek_username = input_username_login.getText().toString();
    }

    public void setData(){
        input_password_login.setText(data_password);
        input_username_login.setText(data_username);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cek_username = input_username_login.getText().toString();
                //cek_password = input_password_login.getText().toString();

                //if((input_username_login.getText().toString().equals(data_username)) && (input_password_login.getText().toString().equals(data_password))){
                    //Toast.makeText(Main2Activity.this, "Berhasil masuk", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(Main2Activity.this, ScreenMenuActivity.class);
                    //startActivity(intent);
                //}else{
                    //Toast.makeText(Main2Activity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                //}
                Intent intent = new Intent(Main2Activity.this, ScreenMenuActivity.class);
                startActivity(intent);
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