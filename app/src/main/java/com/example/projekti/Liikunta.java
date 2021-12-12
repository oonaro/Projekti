package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import org.json.JSONException;
import org.json.JSONObject;

public class Liikunta extends AppCompatActivity {

    private Button send;
    private EditText arkiliikunta;
    private EditText aktiiviliikunta;

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

        send = (Button) findViewById(R.id.send);
        arkiliikunta = (EditText) findViewById(R.id.editTextNumber);
        aktiiviliikunta = (EditText) findViewById(R.id.editTextNumber2);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}

