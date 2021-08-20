package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto7);
    }
    public void calcular(View v){
        EditText Hrs = findViewById(R.id.HorasObr);

        int Horas = Integer.parseInt(Hrs.getText().toString());

        if(Horas > 40){
            int Salario = 40*2000;
            int HorasExtras = Horas-40;
            int SalarioExtra = (HorasExtras*3000)+Salario;
            TextView salario = (TextView) findViewById(R.id.SueldoHrs);
            salario.setText("Salario despues del aumento es: " + SalarioExtra);
        }else if(Horas <= 40){
            int Salario = Horas*2000;
            TextView salario = (TextView) findViewById(R.id.SueldoHrs);
            salario.setText("Salario sin aumento: " + Salario);
        }
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}