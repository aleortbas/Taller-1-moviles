package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto11);
    }
    public void Calcular(View v){
        EditText gas1 = findViewById(R.id.gasto1);
        EditText gas2 = findViewById(R.id.gasto2);
        EditText gas3 = findViewById(R.id.gasto3);
        EditText gas4 = findViewById(R.id.gasto4);
        EditText gas5 = findViewById(R.id.gasto5);

        int gasto1 = Integer.parseInt(gas1.getText().toString());
        int gasto2 = Integer.parseInt(gas2.getText().toString());
        int gasto3 = Integer.parseInt(gas3.getText().toString());
        int gasto4 = Integer.parseInt(gas4.getText().toString());
        int gasto5 = Integer.parseInt(gas5.getText().toString());

        int sumaGastos = gasto1 + gasto2 + gasto3 + gasto4 + gasto5;

        TextView gastosFinal = findViewById(R.id.gastosViajes);
        gastosFinal.setText("Los gastos totales fueron: " + sumaGastos);
    }
}