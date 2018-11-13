package com.example.spart.eva2_examen_practico;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Captura extends AppCompatActivity implements View.OnClickListener {
ImageView imImagen;
Button bGuar;
EditText etxtDescrip,etxtNom,etxtDirecTel;
Intent inLanzar, inGuardar;
 int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captura);
        imImagen = findViewById(R.id.ivImagen);
        bGuar = findViewById(R.id.bGuard);
        etxtDescrip = findViewById(R.id.etxtDescripcion);
        etxtNom = findViewById(R.id.etxtNombre);
        etxtDirecTel = findViewById(R.id.etxtDirecyTel);
        imImagen.setOnClickListener(this);
        inGuardar = getIntent();
        Bundle bundle= getIntent().getExtras();
        int s=bundle.getInt("a");
        a=s;
        if(a==1){
            int imagen=bundle.getInt("IMAGEN");
         imImagen.setImageResource(imagen);
        }

    }


    public void clickg(View view){

Bundle bundle = getIntent().getExtras();
        String sNom = etxtNom.getText().toString();
        String sDes = etxtDescrip.getText().toString();
        String sDirecTel = etxtDirecTel.getText().toString();
        int imagen=bundle.getInt("IMAGEN");

        inGuardar.putExtra("Restaurantes", sNom);
        inGuardar.putExtra("Descripcion", sDes);
        inGuardar.putExtra("DirecTel", sDirecTel);
        inGuardar.putExtra("IMA",imagen);
        Toast.makeText(this, inGuardar.getStringExtra("Restaurantes"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, inGuardar.getStringExtra("Descripcion"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, inGuardar.getStringExtra("DirecTel"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, inGuardar.getIntExtra("IMA",0), Toast.LENGTH_SHORT).show();
        setResult(Activity.RESULT_OK,inGuardar);
        finish();

    }

    @Override
    public void onClick(View v) {
        inLanzar = new Intent(this,seleccionarImagen.class);

        startActivity(inLanzar);
        finish();
    }
}
