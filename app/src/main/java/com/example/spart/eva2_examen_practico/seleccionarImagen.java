package com.example.spart.eva2_examen_practico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class seleccionarImagen extends AppCompatActivity {
    Integer[] imgRest={
            R.drawable.barrafina,
            R.drawable.bourkestreetbakery,
            R.drawable.cafedeadend,
            R.drawable.cafeloisl,
            R.drawable.cafelore,
            R.drawable.confessional,
            R.drawable.donostia,
            R.drawable.fiveleaves,
            R.drawable.forkeerestaurant,
            R.drawable.grahamavenuemeats,
            R.drawable.haighschocolate,
            R.drawable.homei,
            R.drawable.palominoespresso,
            R.drawable.petiteoyster,
            R.drawable.posatelier,
            R.drawable.royaloak,
            R.drawable.teakha,
            R.drawable.thaicafe,
            R.drawable.traif,
            R.drawable.upstate,
            R.drawable.wafflewolf};
    ListView lisIma;
ArrayList<imagenes> imagenes = new ArrayList<imagenes>();
Intent inLanzarDetalles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_imagen);
        lisIma = findViewById(R.id.listImagenes);
        inLanzarDetalles = new Intent(this,Captura.class);
    AdaptadorImagenes ima = new AdaptadorImagenes(this,imgRest);
        lisIma.setAdapter(ima);
        lisIma.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                switch (position){
                    case 0:
                        bundle.putInt("a",1);

                        bundle.putInt("IMAGEN",R.drawable.barrafina);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();
                        break;
                    case 1:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.bourkestreetbakery);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 2:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.cafedeadend);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 3:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.cafeloisl);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 4:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.cafelore);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 5:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.confessional);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 6:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.donostia);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 7:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.fiveleaves);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 8:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.forkeerestaurant);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 9:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.grahamavenuemeats);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 10:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.haighschocolate);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 11:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.homei);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 12:

                        bundle.putInt("IMAGEN",R.drawable.palominoespresso);
                        bundle.putInt("a",1);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 13:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.petiteoyster);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 14:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.posatelier);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 15:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.royaloak);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 16:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.teakha);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        finish();

                        break;
                    case 17:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.thaicafe);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 18:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.traif);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 19:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.upstate);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 20:
                        bundle.putInt("a",1);
                        bundle.putInt("IMAGEN",R.drawable.wafflewolf);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                }
            }
        });
    }
}
