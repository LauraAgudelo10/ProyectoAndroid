package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void NextInfo(View view){
        Intent i= new Intent(this, SiguienteInfo.class);
        startActivity(i);
    }

    public void NextSiguiente(View view){
        Intent r= new Intent(this, SiguienteRegistro.class);
        startActivity(r);
    }

        }
