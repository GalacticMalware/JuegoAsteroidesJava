package com.example.danielalejandro.asteroides;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Vector;

public class AlmacenPuntuaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacen_puntuaciones);
    }

    public interface AlmanenPuntuaciones{
        public void guardarPuntuacion(int puntos, String nombre, long fecha);
        public Vector<String> listaPuntuaciones(int cantiudad);
    }
}
