package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 22-04-2022

public class ScreenMenuActivity extends AppCompatActivity {

    private Button btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_menu);

        btn_profile = findViewById(R.id.btn_profile);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(ScreenMenuActivity.this, ScreenProfileActivity.class);
                startActivity(ip);
            }
        });
    }

    public void logout(View view){
        Intent il = new Intent(ScreenMenuActivity.this, LoginActivity.class);
        startActivity(il);
    }
}