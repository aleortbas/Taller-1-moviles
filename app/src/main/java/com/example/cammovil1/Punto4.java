package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto4);
    }
    public void verificar(View v){
        EditText num = findViewById(R.id.NumeroPunto4);

        int numero = Integer.parseInt(num.getText().toString());

        if(numero < 0){
            TextView Verificado = (TextView) findViewById(R.id.ResultadoPt4);
            Verificado.setText("El numero menor a cero : "+numero);
        }else if(numero > 0){
            TextView Verificado = (TextView) findViewById(R.id.ResultadoPt4);
            Verificado.setText("El numero mayor a cero : "+numero);
        }else if(numero == 0){
            TextView Verificado = (TextView) findViewById(R.id.ResultadoPt4);
            Verificado.setText("El numero es : "+numero);
        }

    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}