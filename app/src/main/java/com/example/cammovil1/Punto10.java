package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

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

        int i;
        int resultado;
        int multiplo = Integer.parseInt(mult.getText().toString());
        int desde = Integer.parseInt(des.getText().toString());
        int hasta = Integer.parseInt(has.getText().toString());
        int suma = 0;



        int[] numeros = new int[hasta];
        for (i = 0; i < hasta; i++) {
            numeros[i] = 1+i;
            resultado = numeros[i]%multiplo;

            if(resultado == 0){
                suma +=numeros[i];
            }
        }
        TextView SumaMultiplos = (TextView) findViewById(R.id.resultadoSUMA);
        SumaMultiplos.setText("La suma de los multiplos es: " + suma);
    }
}