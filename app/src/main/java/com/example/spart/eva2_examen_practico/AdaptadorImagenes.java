package com.example.spart.eva2_examen_practico;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class AdaptadorImagenes extends ArrayAdapter<Integer> {
     Activity context;
    Integer[] integer;


    public AdaptadorImagenes(@NonNull Activity context, @NonNull Integer[] objects) {
        super(context,R.layout.imagen,objects);

        this.context=context;
        this.integer=objects;
    }
    public View getView(int posicion, View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.imagen,null,true);
        ImageView imgV_foto = (ImageView) rowView.findViewById(R.id.imsola);


        imgV_foto.setImageResource(integer[posicion]);


        return rowView;
    }
}
