package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto9);
    }
    public void operar(View v){
        EditText num1 = findViewById(R.id.nu1);
        EditText num2 = findViewById(R.id.nu2);
        EditText num3 = findViewById(R.id.nu3);
        EditText num4 = findViewById(R.id.nu4);
        EditText num5 = findViewById(R.id.nu5);
        EditText num6 = findViewById(R.id.nu6);
        EditText num7 = findViewById(R.id.nu7);
        EditText num8 = findViewById(R.id.nu8);
        EditText num9 = findViewById(R.id.nu9);

        int i = 0;
        double multiplicacion = 1;
        double menoresCero = 0;
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int n3 = Integer.parseInt(num3.getText().toString());
        int n4 = Integer.parseInt(num4.getText().toString());
        int n5 = Integer.parseInt(num5.getText().toString());
        int n6 = Integer.parseInt(num6.getText().toString());
        int n7 = Integer.parseInt(num7.getText().toString());
        int n8 = Integer.parseInt(num8.getText().toString());
        int n9 = Integer.parseInt(num9.getText().toString());


        int numeros[] =new int[]{n1,n2,n3,n4,n5,n6,n7,n8,n9};

        for (int u=0; u < numeros.length; u++){

            if(numeros[u] > 0){
                multiplicacion *= numeros[u];
            }else if(numeros[u] == 0){
                i++;
                menoresCero = i;
            }
        }
        TextView Multiplicacion = (TextView) findViewById(R.id.MultiplicacionMayores);
        Multiplicacion.setText("La multiplicacion de mayores a cero: " + multiplicacion);
        TextView MenoresCero = (TextView) findViewById(R.id.TotalCeros);
        MenoresCero.setText("Total de numeros menores a cero: " + menoresCero);
    }
}