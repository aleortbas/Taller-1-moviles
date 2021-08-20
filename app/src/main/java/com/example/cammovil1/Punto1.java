package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Punto1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto1);
    }
    public void calcular(View v){

        EditText salario = findViewById(R.id.salario);
        EditText horas = findViewById(R.id.horas);

        int sal = Integer.parseInt(salario.getText().toString());
        int hrs = Integer.parseInt(horas.getText().toString());

        int TotalSal = sal * hrs;

        EditText res = findViewById(R.id.Resultado);
        res.setText("Tu salario es: " + TotalSal);
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}