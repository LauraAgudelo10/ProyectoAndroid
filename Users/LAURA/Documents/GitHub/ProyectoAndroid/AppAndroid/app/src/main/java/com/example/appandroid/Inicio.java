package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(Inicio.this, MainActivity.class);
                startActivity(i);
            }
        }, 2000);
    }
}
