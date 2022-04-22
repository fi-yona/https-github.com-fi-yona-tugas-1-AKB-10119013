package com.example.tugas1akb_10119013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenProfileActivity extends AppCompatActivity {

    private Button btn_kembali_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_profile);

        btn_kembali_menu = findViewById(R.id.btn_kembali_menu);

        btn_kembali_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikm  = new Intent(ScreenProfileActivity.this, ScreenMenuActivity.class);
                startActivity(ikm);
            }
        });
    }
}