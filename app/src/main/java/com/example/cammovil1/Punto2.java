package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Punto2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto2);
    }
    public void calcular(View v){

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        EditText num3 = findViewById(R.id.num3);
        EditText num4 = findViewById(R.id.num4);
        EditText num5 = findViewById(R.id.num5);

        double numero1 = Integer.parseInt(num1.getText().toString());
        double numero2 = Integer.parseInt(num2.getText().toString());
        double numero3 = Integer.parseInt(num3.getText().toString());
        double numero4 = Integer.parseInt(num4.getText().toString());
        double numero5 = Integer.parseInt(num5.getText().toString());

        double operacion1 = (((numero1+numero2)-numero3)*numero4)/numero5;
        double operacion2 = (((numero5+numero4)-numero3)*numero2)/numero1;

        EditText res = findViewById(R.id.Resultado2);
        res.setText("Operacion 1: " + operacion1 + ", Operacion 2: " + String.format("%.2f",operacion2));
    }
    public void atras2(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}