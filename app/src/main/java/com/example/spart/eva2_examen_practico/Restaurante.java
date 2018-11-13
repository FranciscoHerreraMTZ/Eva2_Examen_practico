package com.example.spart.eva2_examen_practico;

import java.io.Serializable;
import java.util.ArrayList;

public class Restaurante  implements Serializable {
    String sNom,sDescri,sDirecyTel;
    int iImag;

    public Restaurante(String sNome,String sDes,String sDiTel,int imag){
        sNom=sNome;
        sDescri = sDes;
        sDirecyTel = sDiTel;
        iImag=imag;
    }

}
