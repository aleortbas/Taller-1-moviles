package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto13);
    }
    public void CalcularCifras(View v){
        EditText num = findViewById(R.id.NumeroCifras);

        int numCifras = 0;
        int numero = Integer.parseInt(num.getText().toString());

        while (numero != 0){
            numero = numero/10;
            numCifras ++;
        }
        TextView cifras = (TextView) findViewById(R.id.Cifras);
        cifras.setText("La suma de los multiplos es: " + numCifras);
    }
}