package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto10);
    }
    public void sumarmultiplos(View v){
        EditText mult = findViewById(R.id.multiplo);
        EditText des = findViewById(R.id.desde);
        EditText has = findViewById(R.id.hasta);

        int suma = 0;
        int multiplo = Integer.parseInt(mult.getText().toString());
        int desde = Integer.parseInt(des.getText().toString());
        int hasta = Integer.parseInt(has.getText().toString());

        while(desde <= hasta){
            if(desde%multiplo == 0){
                suma += desde;
            }
            desde ++;
        }
        TextView SumaMultiplos = (TextView) findViewById(R.id.resultadoSUMA);
        SumaMultiplos.setText("La suma de los multiplos es: " + suma);
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}