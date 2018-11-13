package com.example.spart.eva2_examen_practico;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptadormostrar extends ArrayAdapter<Restaurante> {
    Context context;
    int iLayo;
    ArrayList<Restaurante> sNombre;

    public Adaptadormostrar(@NonNull Context context, int resource, @NonNull ArrayList<Restaurante> objects) {
        super(context, resource, objects);
        iLayo=resource;
        this.context = context;
        this.sNombre=objects;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;
        if(rowView == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            rowView = inflater.inflate(iLayo, parent, false);
        }
        ImageView imgV_foto = (ImageView)rowView.findViewById(R.id.imgVw);
        TextView txtV_titulo=(TextView)rowView.findViewById(R.id.txtNom);
        TextView txtV_descrip=(TextView)rowView.findViewById(R.id.txtDesc);
        TextView txtV_directel=(TextView)rowView.findViewById(R.id.txtDesTel);

        imgV_foto.setImageResource(sNombre.get(position).iImag);
        txtV_titulo.setText(sNombre.get(position).sNom);
        txtV_descrip.setText(sNombre.get(position).sDescri);
        txtV_directel.setText(sNombre.get(position).sDirecyTel);

        return rowView;
    }
}
