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

public class MainActivity extends AppCompatActivity {

    private Button btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_profile = findViewById(R.id.btn_profile);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(ip);
            }
        });
    }

    public void logout(View view){
        Intent il = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(il);
    }
}