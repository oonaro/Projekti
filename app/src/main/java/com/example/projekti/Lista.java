package com.example.projekti;

import static android.R.layout.simple_list_item_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {
    public final static String EXTRA = "com.example.lista";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListView lv = (ListView) findViewById(R.id.listView);


        lv.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                ListaSingleton.getInstance().getTiedot())

        );

           /*     ListaSingleton.getInstance().addTieto(liikuntaminuutit);
        ListaSingleton.getInstance().addTieto(fiilis);
        ListaSingleton.getInstance().addTieto(unenmaara);
        ListaSingleton.getInstance().addTieto(ruoka);
        ListaSingleton.getInstance().addTieto(kalorit);
        ListaSingleton.getInstance().addTieto(askeleet);
        ListaSingleton.getInstance().addTieto(unenarvio);*/
    }
}
