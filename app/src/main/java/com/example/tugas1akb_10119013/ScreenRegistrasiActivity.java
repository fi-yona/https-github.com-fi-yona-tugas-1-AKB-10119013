package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ScreenRegistrasiActivity extends AppCompatActivity {

    private Button btn_kembali_login, btn_daftarkan;
    private EditText input_username_regis, input_password_regis;
    private String username_regis, password_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_registrasi);

        btn_kembali_login = findViewById(R.id.btn_kembali_login);

        btn_kembali_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikl = new Intent(ScreenRegistrasiActivity.this, Main2Activity.class);
                startActivity(ikl);
            }
        });

        initView();
        setData();
    }

    public void initView(){
        btn_daftarkan = findViewById(R.id.btn_daftarkan);
        input_username_regis = findViewById(R.id.input_username_regis);
        input_password_regis = findViewById(R.id.input_password_regis);
    }

    public void setData(){
        btn_daftarkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username_regis = input_username_regis.getText().toString();
                password_regis = input_password_regis.getText().toString();

                Intent intent = new Intent(ScreenRegistrasiActivity.this, Main2Activity.class);
                intent.putExtra("username_regis", username_regis);
                intent.putExtra("password_regis", password_regis);
                startActivity(intent);
                Toast.makeText(ScreenRegistrasiActivity.this, "berhasil didaftarkan!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}