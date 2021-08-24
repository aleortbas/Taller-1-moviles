package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto12);
    }
    public void calcular (View v){
        EditText art1 = findViewById(R.id.articulo1);
        EditText art2 = findViewById(R.id.articulo2);
        EditText art3 = findViewById(R.id.articulo3);
        EditText art4 = findViewById(R.id.articulo4);
        EditText art5 = findViewById(R.id.articulo5);

        EditText can1 = findViewById(R.id.Cantidad1);
        EditText can2 = findViewById(R.id.Cantidad2);
        EditText can3 = findViewById(R.id.Cantidad3);
        EditText can4 = findViewById(R.id.Cantidad4);
        EditText can5 = findViewById(R.id.Cantidad5);

        int articulo1 = Integer.parseInt(art1.getText().toString());
        int articulo2 = Integer.parseInt(art2.getText().toString());
        int articulo3 = Integer.parseInt(art3.getText().toString());
        int articulo4 = Integer.parseInt(art4.getText().toString());
        int articulo5 = Integer.parseInt(art5.getText().toString());

        int cantidad1 = Integer.parseInt(can1.getText().toString());
        int cantidad2 = Integer.parseInt(can2.getText().toString());
        int cantidad3 = Integer.parseInt(can3.getText().toString());
        int cantidad4 = Integer.parseInt(can4.getText().toString());
        int cantidad5 = Integer.parseInt(can5.getText().toString());

        int totalArticulo1 = articulo1*cantidad1;
        int totalArticulo2 = articulo2*cantidad2;
        int totalArticulo3 = articulo3*cantidad3;
        int totalArticulo4 = articulo4*cantidad4;
        int totalArticulo5 = articulo5*cantidad5;

        int total = totalArticulo1 + totalArticulo2 + totalArticulo3 +
                totalArticulo4 + totalArticulo5;
        TextView Total = (TextView) findViewById(R.id.TotalMercado);
        Total.setText("Total:" + total);

    }
}