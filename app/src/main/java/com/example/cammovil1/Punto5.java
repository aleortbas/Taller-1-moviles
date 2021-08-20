package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto5);
    }
    public void ParImpar(View v){
        EditText num = findViewById(R.id.numeroParImpar);

        double numero = Integer.parseInt(num.getText().toString());

        if(numero % 2 == 0){
            TextView Verificado = (TextView) findViewById(R.id.ResultadoPunto5);
            Verificado.setText("El numero ingrsado " + numero + " es par");
        }else{
            TextView Verificado = (TextView) findViewById(R.id.ResultadoPunto5);
            Verificado.setText("El numero ingrsado " + numero + " es impar");
        }
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}