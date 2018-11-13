package com.example.spart.eva2_examen_practico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Mostrar extends AppCompatActivity {
    ArrayList<String> asNombre;
    ArrayList<String> asDes;
    ArrayList<String>  asDire;
    ArrayList<Integer> aiIman;
    Restaurante[] lLista2;
ListView lisMostrar;
Intent iDer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        lisMostrar = findViewById(R.id.lisMostrar);
        Intent bundle;
        bundle=getIntent();
        ArrayList<Restaurante> lLista =(ArrayList<Restaurante>) bundle.getSerializableExtra("lista");


        Adaptadormostrar ad = new Adaptadormostrar(this,R.layout.content_descripcionrestaurante,MainActivity.rRestaurante);
        lisMostrar.setAdapter(ad);
    }
}
