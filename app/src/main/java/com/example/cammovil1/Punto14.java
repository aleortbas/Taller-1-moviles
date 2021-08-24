package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto14);
    }
    public void calcular(View v){
        EditText num = findViewById(R.id.numeroParImp);

        int sumaPar = 0;
        int sumaImpar = 0;
        String digitos = "";
        int numero = Integer.parseInt(num.getText().toString());
        int d = Integer.toString(numero).length();

        for(int i = 0; i < d; i++){
            digitos = String.valueOf(Integer.toString(numero).charAt(i));
            if(Integer.parseInt(digitos)%2==0){
                sumaPar += Integer.parseInt(digitos);
            }else{
                sumaImpar += Integer.parseInt(digitos);
            }
        }

        TextView par = (TextView) findViewById(R.id.SumaPar);
        par.setText("La suma de los pares es: " + sumaPar);

        TextView impar = (TextView) findViewById(R.id.Sumaimpar);
        impar.setText("La suma de los impare es: " + sumaImpar);

    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}