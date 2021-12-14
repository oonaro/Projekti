package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Liikuntainfo extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikuntainfo);

        TextView t1;
        TextView t2;
        TextView t3;
        TextView t4;
        TextView t5;
        TextView t6;
        TextView t7;
        TextView t8;
        TextView t9;
        TextView t10;
        TextView t11;
        TextView t12;
        TextView t13;
        TextView t14;

        t1 = findViewById(R.id.liikuntaMinuutitTV);
        t2 = findViewById(R.id.fiilisTV);
        t3 = findViewById(R.id.unenMaaraTV);
        t4 = findViewById(R.id.liikuntaArvio);
        t5 = findViewById(R.id.unenarvio);
        t6 = findViewById(R.id.arkiliikuntaTV);
        t7 = findViewById(R.id.unenlaatuTV);
        t8 = findViewById(R.id.ruoka);
        t9 = findViewById(R.id.kaloritTV);
        t10 = findViewById(R.id.kaloriSuositus);
        t11 = findViewById(R.id.terveellisesti);
        t12 = findViewById(R.id.riitavasti);
        t13 = findViewById(R.id.vesi);
        t14 = findViewById(R.id.fiilisasteikko);



        button = findViewById(R.id.palaa);


        SharedPreferences sp = getApplicationContext().getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);
        String liikuntaminuutit = sp.getString("liikuntaminuutit", "");
        String liikuntaminuutit2 = sp.getString("liikuntaminuutit2", "");
        String askeleet = sp.getString("askeleet", "");
        String unenmaara = sp.getString("unenmäärä", "");
        String unenarvio = sp.getString("unenarvio", "");
        String unenlaatu = sp.getString("unenlaatu", "");
        String ruoka = sp.getString("ruoka", "");
        String kalorit = sp.getString("kalorit", "");
        String kalorisuositus = sp.getString("kalorisuositus", "");
        String terveellisesti = sp.getString("terveellisesti", "");
        String tarpeeksi = sp.getString("tarpeeksi", "");
        String vesi = sp.getString("vesi", "");
        String fiilisasteikko = sp.getString("fiilisasteikko", "");
        String fiilis = sp.getString("fiilis", "");

   /*     ListaSingleton.getInstance().addTieto(liikuntaminuutit);
        ListaSingleton.getInstance().addTieto(fiilis);
        ListaSingleton.getInstance().addTieto(unenmaara);
        ListaSingleton.getInstance().addTieto(ruoka);
        ListaSingleton.getInstance().addTieto(kalorit);
        ListaSingleton.getInstance().addTieto(askeleet);
        ListaSingleton.getInstance().addTieto(unenarvio);*/


        t1.setText("Päivän aikana kertyi " + liikuntaminuutit + " min arkiliikuntaa");
        t6.setText("Päivän aikana kertyi " +liikuntaminuutit2 + " min aktiivista liikuntaa");
        t4.setText("noin " + askeleet + " tuhatta askelta tänään");
        t3.setText("Unenmäärä: " +unenmaara + " tuntia");
        t5.setText("Saitko tarpeeksi unta tänään: " + unenarvio);
        t7.setText("Unenlaatu: " + unenlaatu + "/10");
        t8.setText("Tämän päivän ruoka: " + ruoka);
        t9.setText("Kaloreita kului päivän aikana: " +kalorit + " Kcl");
        t10.setText("Täyttikö päivän kalorisuositus: " + kalorisuositus);
        t11.setText("Ruoan terveellisyys: " + terveellisesti + "/10");
        t12.setText("Söin riittävästi: " + tarpeeksi + "/10");
        t13.setText("Joitko vettä tarpeeksi: " + vesi);
        t14.setText("Fiilis tänään: " + fiilisasteikko + "/5");
        t2.setText("Fiilis tänään omin sanoin: " + fiilis);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

    }
}

