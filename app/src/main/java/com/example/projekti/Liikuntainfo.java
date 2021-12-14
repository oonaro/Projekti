package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        TextView ruokaTV;
        TextView kaloritTV;
        TextView t4;
        TextView t5;

        t1 = findViewById(R.id.liikuntaMinuutitTV);
        t2 = findViewById(R.id.fiilisTV);
        t3 = findViewById(R.id.unenMaaraTV);
        ruokaTV = findViewById(R.id.ruokaTV);
        kaloritTV = findViewById(R.id.kaloritTV);
        t4 = findViewById(R.id.liikuntaArvio);
        t5 = findViewById(R.id.unenarvio);

        button = findViewById(R.id.palaa);


        SharedPreferences sp = getApplicationContext().getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);
        String liikuntaminuutit = sp.getString("liikuntaminuutit", "");
        String fiilis = sp.getString("fiilis", "");
        String unenmaara = sp.getString("unenmäärä", "");
        String ruoka = sp.getString("ruoka", "");
        String kalorit = sp.getString("kalorit", "");
        String Askeleet = sp.getString("askeleet", "");
        String Unenarvio = sp.getString("unenarvio", "");




        t1.setText(liikuntaminuutit + " min");
        t2.setText(fiilis);
        t3.setText(unenmaara + " tuntia");
        ruokaTV.setText(ruoka);
        kaloritTV.setText(kalorit + " kaloria");
        t4.setText("noin " + Askeleet + " tuhatta askelta");
        t5.setText(Unenarvio + "unenarvio");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

    }
}

