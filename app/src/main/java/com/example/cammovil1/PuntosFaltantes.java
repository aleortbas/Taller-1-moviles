package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PuntosFaltantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntos_faltantes);
    }
    public void punto12(View v){

        Intent p12 = new Intent( this, Punto12.class);
        startActivity(p12);
    }
    public void punto13(View v){

        Intent p13 = new Intent( this, Punto13.class);
        startActivity(p13);
    }
    public void punto14(View v){

        Intent p14 = new Intent( this, Punto14.class);
        startActivity(p14);
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}