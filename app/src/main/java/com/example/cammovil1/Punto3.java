package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto3);
    }
    public void calcular(View v){

        EditText empleado1 = findViewById(R.id.empleado1);
        EditText empleado2 = findViewById(R.id.empleado2);
        EditText empleado3 = findViewById(R.id.empleado3);

        String emple1 = empleado1.getText().toString();
        String emple2 = empleado2.getText().toString();
        String emple3 = empleado3.getText().toString();

        EditText sal1 = findViewById(R.id.salario1);
        EditText sal2 = findViewById(R.id.salario2);
        EditText sal3 = findViewById(R.id.salario3);

        int sala1 = Integer.parseInt(sal1.getText().toString());
        int sala2 = Integer.parseInt(sal2.getText().toString());
        int sala3 = Integer.parseInt(sal3.getText().toString());

        double aumento1 = (sala1*0.05)+sala1;
        double aumento2 = (sala2*0.1)+sala2;
        double aumento3 = (sala3*0.25)+sala3;

        TextView Aumento1 = (TextView) findViewById(R.id.aumento5);
        Aumento1.setText("Nombre: "+emple1 + " Salario: " + aumento1);

        TextView Aumento2 = (TextView) findViewById(R.id.aumento10);
        Aumento2.setText("Nombre: "+emple2 + "Salario: " + aumento2);

        TextView Aumento3 = (TextView) findViewById(R.id.aumento25);
        Aumento3.setText("Nombre: "+emple3 + "Salario: " + aumento3);

    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}