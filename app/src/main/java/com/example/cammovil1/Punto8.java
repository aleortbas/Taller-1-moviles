package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto8);
    }
    public void calcular(View v){
        EditText sueldo = findViewById(R.id.SueldoPr);
        EditText antiguedad = findViewById(R.id.antiguedad);

        int Sueldo = Integer.parseInt(sueldo.getText().toString());
        int Antiguedad = Integer.parseInt(antiguedad.getText().toString());

        if(Antiguedad < 1){
            double prima = (Sueldo * 0.05)+Sueldo;
            TextView salario = (TextView) findViewById(R.id.PrimaAnualRes);
            salario.setText("Sueldo original: " + Sueldo + ", sueldo con prima anual: " +prima);
        }else if(Antiguedad <= 1 || Antiguedad < 2){
            double prima = (Sueldo * 0.07)+Sueldo;
            TextView salario = (TextView) findViewById(R.id.PrimaAnualRes);
            salario.setText("Sueldo original: " + Sueldo + ", sueldo con prima anual: " +prima);
        }else if(Antiguedad <= 2 || Antiguedad < 5){
            double prima = (Sueldo * 0.1)+Sueldo;
            TextView salario = (TextView) findViewById(R.id.PrimaAnualRes);
            salario.setText("Sueldo original: " + Sueldo + ", sueldo con prima anual: " +prima);
        }else if(Antiguedad <= 5 || Antiguedad < 10){
            double prima = (Sueldo * 0.15)+Sueldo;
            TextView salario = (TextView) findViewById(R.id.PrimaAnualRes);
            salario.setText("Sueldo original: " + Sueldo + ", sueldo con prima anual: " +prima);
        }else if(Antiguedad >= 10){
            double prima = (Sueldo * 0.20)+Sueldo;
            TextView salario = (TextView) findViewById(R.id.PrimaAnualRes);
            salario.setText("Sueldo original: " + Sueldo + ", sueldo con prima anual: " +prima);
        }
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}