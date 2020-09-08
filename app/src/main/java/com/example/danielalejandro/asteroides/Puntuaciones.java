package com.example.danielalejandro.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by Daniel Alejandro on 07/12/2017.
 */

public class Puntuaciones extends ListActivity {

    @Override public void onCreate(Bundle savedInstante){
        super.onCreate(savedInstante);
        setContentView(R.layout.activity_almacen_puntuaciones);
        //setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,MainActivity.almanenPuntuaciones.listaPuntuaciones(10)));
        setListAdapter(
                new ArrayAdapter<String>(this,R.layout.elemento_lista,R.id.titulo, MainActivity.almanenPuntuaciones.listaPuntuaciones(10)));

    }
}
