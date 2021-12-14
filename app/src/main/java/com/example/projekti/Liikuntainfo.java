package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Liikuntainfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikuntainfo);
        TextView t1;
        TextView t2;
        TextView t3;
        TextView ruokaTV;
        TextView kaloritTV;

        t1 = findViewById(R.id.liikuntaMinuutitTV);
        t2 = findViewById(R.id.fiilisTV);
        t3 = findViewById(R.id.unenMaaraTV);
        ruokaTV = findViewById(R.id.ruokaTV);
        kaloritTV = findViewById(R.id.kaloritTV);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);
        String liikuntaminuutit = sp.getString("liikuntaminuutit", "");
        String fiilis = sp.getString("fiilis", "");
        String unenmaara = sp.getString("unenmäärä", "");
        String ruoka = sp.getString("ruoka", "");
        String kalorit = sp.getString("kalorit", "");

        t1.setText(liikuntaminuutit + " min");
        t2.setText(fiilis);
        t3.setText(unenmaara + " tuntia");
        ruokaTV.setText(ruoka);
        kaloritTV.setText(kalorit + " kaloria");
    }
}
