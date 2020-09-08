package com.example.danielalejandro.asteroides;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Daniel Alejandro on 06/12/2017.
 */

public class Preferencias extends PreferenceActivity {

    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }



    }

