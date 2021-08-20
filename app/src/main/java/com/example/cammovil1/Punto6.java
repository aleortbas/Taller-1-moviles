package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto6);
    }
    public void promedio(View v){
        EditText nom = findViewById(R.id.nombre);
        EditText n1 = findViewById(R.id.nota1);
        EditText n2 = findViewById(R.id.nota2);
        EditText n3 = findViewById(R.id.nota3);

        String nombre = nom.getText().toString();
        double nota1 = Double.parseDouble(n1.getText().toString());
        double nota2 = Double.parseDouble(n2.getText().toString());
        double nota3 = Double.parseDouble(n3.getText().toString());

        double promedio = (nota1+nota2+nota3)/3;

        if(promedio >= 3.5) {
            TextView Notafin = (TextView) findViewById(R.id.PromedioEst);
            Notafin.setText("El promdeio final de: " + nombre + ", es: " + promedio + ", por lo tanto aprobo");
        }else {
            TextView Notafin = (TextView) findViewById(R.id.PromedioEst);
            Notafin.setText("El promdeio final de: " + nombre + ", es: " + promedio + ", por lo tanto reprobo");
        }
    }
    public void atras(View v){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}