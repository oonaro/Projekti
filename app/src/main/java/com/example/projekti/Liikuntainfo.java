package com.example.projekti;

/**
 * Liikuntainfo luokka
 * @author oonarosenblad
 * luokka jossa tiedot haetaan kaikki kayttajan syottamat tiedot shared preferenssistä
 */


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Liikuntainfo extends AppCompatActivity {

    Button button;

    Calendar calendar;
    SimpleDateFormat dateFormat;
    String date;

    /**
     * Haetaan tiedot shared preferenssista key -avaimien avulla ja lisätään listalle.
     * Luodaan myos kalenteri joka hakee sen hetkisen ajan ja lisaa sen listalle
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikuntainfo);

        button = findViewById(R.id.palaa);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        date = dateFormat.format(calendar.getTime());

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);
        String liikuntaminuutit = sp.getString("liikuntaminuutit", "");
        String liikuntaminuutit2 = sp.getString("liikuntaminuutit2", "");
        String askeleet = sp.getString("askeleet", "");
        String unenmaara = sp.getString("unenmaara", "");
        String unenarvio = sp.getString("unenarvio", "");
        String unenlaatu = sp.getString("unenlaatu", "");
        String unet = sp.getString("unet", "");
        String ruoka = sp.getString("ruoka", "");
        String kalorit = sp.getString("kalorit", "");
        String kalorisuositus = sp.getString("kalorisuositus", "");
        String terveellisesti = sp.getString("terveellisesti", "");
        String tarpeeksi = sp.getString("tarpeeksi", "");
        String vesi = sp.getString("vesi", "");
        String fiilisasteikko = sp.getString("fiilisasteikko", "");
        String fiilis = sp.getString("fiilis", "");

        ListView lv = (ListView)findViewById(R.id.yhteenvetoListView);

        YhteenvetoTiedot yhteenveto = new YhteenvetoTiedot
                (date, ruoka, liikuntaminuutit, liikuntaminuutit2, unenmaara, askeleet, unenarvio, unenlaatu, unet,
                        kalorit, kalorisuositus, terveellisesti, tarpeeksi, vesi, fiilisasteikko, fiilis);


        YhteenvetoSingleton.getInstance().addYhteenveto(yhteenveto);

        lv.setAdapter(new ArrayAdapter<YhteenvetoTiedot>(
                this,
                android.R.layout.simple_list_item_1,
                YhteenvetoSingleton.getInstance().getYhteenveto()
        ));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

