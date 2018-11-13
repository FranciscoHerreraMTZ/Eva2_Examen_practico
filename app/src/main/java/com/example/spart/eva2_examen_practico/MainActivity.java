package com.example.spart.eva2_examen_practico;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button bGuardar, bMostrar,bSalir;
Intent inLanzar ,inSa;
static ArrayList<Restaurante> rRestaurante = new ArrayList<Restaurante>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bGuardar = findViewById(R.id.bGuardar);
        bMostrar = findViewById(R.id.bMostrar);
        bSalir = findViewById(R.id.bSalir);
        inSa = new Intent(this,Captura.class);
        inLanzar = new Intent(this,Mostrar.class);
        rRestaurante.add(new Restaurante("pepes","Frio","45245478",R.drawable.barrafina));
    }
    public void click(View view){
        Bundle bundle=new Bundle();
        bundle.putInt("a",2);

        inSa.putExtras(bundle);

         startActivityForResult(inSa,100);
    }
    public void clickMostrar(View view){

        inLanzar.putExtra("lista",rRestaurante);
        startActivity(inLanzar);
    }
    public void clickSalir(View view){
       finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if (requestCode==100&&resultCode == Activity.RESULT_OK) {
                Restaurante miR = new Restaurante(data.getStringExtra("Restaurantes"), data.getStringExtra("Descripcion"), data.getStringExtra("DirecTel"), data.getIntExtra("IMA", 0));
                rRestaurante.add(miR);
                Toast.makeText(this, "mecos", Toast.LENGTH_SHORT).show();
            }
    }
}
