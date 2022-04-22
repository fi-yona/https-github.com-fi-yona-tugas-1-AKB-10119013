package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenRegistrasiActivity extends AppCompatActivity {

    private Button btn_kembali_login;

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
    }
}