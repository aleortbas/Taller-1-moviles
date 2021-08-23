package com.example.cammovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void punto1(View v){

        Intent p1 = new Intent( this,Punto1.class);
        startActivity(p1);
    }
    public void punto2(View v){

        Intent p2 = new Intent( this,Punto2.class);
        startActivity(p2);
    }
    public void punto3(View v){

        Intent p3 = new Intent( this,Punto3.class);
        startActivity(p3);
    }
    public void punto4(View v){

        Intent p4 = new Intent( this,Punto4.class);
        startActivity(p4);
    }
    public void punto5(View v){

        Intent p5 = new Intent( this,Punto5.class);
        startActivity(p5);
    }
    public void punto6(View v){

        Intent p6 = new Intent( this,Punto6.class);
        startActivity(p6);
    }
    public void punto7(View v){

        Intent p7 = new Intent( this,Punto7.class);
        startActivity(p7);
    }
    public void punto8(View v){

        Intent p8 = new Intent( this,Punto8.class);
        startActivity(p8);
    }
    public void punto9(View v){

        Intent p9 = new Intent( this,Punto9.class);
        startActivity(p9);
    }
    public void punto10(View v){

        Intent p10 = new Intent( this,Punto10.class);
        startActivity(p10);
    }
}