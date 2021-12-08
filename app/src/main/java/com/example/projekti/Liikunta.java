package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Liikunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikunta);

        /**
         * Ensimmäinen dropdownvalikko
         */

        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(Liikunta.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Ravinto));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);
    }
}

