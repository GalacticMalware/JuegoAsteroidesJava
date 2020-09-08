package com.example.danielalejandro.asteroides;

import java.util.Vector;

/**
 * Created by Daniel Alejandro on 07/12/2017.
 */

public class AlmacenPuntuacionArray implements AlmacenPuntuaciones.AlmanenPuntuaciones{
    private Vector<String> puntuaciones;
    public AlmacenPuntuacionArray(){
        puntuaciones = new Vector<String>();
        puntuaciones.add("123000 Pepito");
        puntuaciones.add("11100 Pedro");
        puntuaciones.add("01000 Paco");
    }
    @Override public void guardarPuntuacion(int puntos, String nombre, long fecha){
        puntuaciones.add(0,puntos+""+nombre);
    }
    @Override public  Vector<String> listaPuntuaciones(int cantidad){
        return puntuaciones;
    }
}
