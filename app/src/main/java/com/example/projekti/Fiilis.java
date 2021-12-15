package com.example.projekti;

/**
 * Elamantapapaivakirja
 * Fiilis activity
 * @author oonarosenblad
 * luokka jossa tiedot haetaan liikuntainfo luokasta ja talletetaan Yhteenveto tiedot listalle muuttujana
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class Fiilis extends AppCompatActivity {

    EditText fiilis;
    Button button;
    SharedPreferences sp;
    String fiilisStr;
    SeekBar seekBar;
    int seekBarStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiilis);

        fiilis = findViewById(R.id.editTextTextPersonName2);
        button = findViewById(R.id.tallenna2);
        seekBar = findViewById(R.id.seekBar_fiilis);

        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

        /**
         * *
         * @param fiilis = kayttajan asettama arvo
         * @param seekBar = kayttajan asettama arvo
         *
         *Lukee kayttajan syottamat tiedot ja tallentaa ne Shared Preferenssiin Stringeina (.Str)
         *putStringissa asetetaan avaimet (liikuntaminuutit2, liikuntaminuutit ja askeleet)
         *joilla parametrit voidaan hakea myohemmin
         */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fiilisStr = fiilis.getText().toString();
                seekBarStr = seekBar.getProgress();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("fiilis", fiilisStr);
                editor.putString("fiilisasteikko", String.valueOf(seekBarStr));

                editor.commit();
                Toast.makeText(Fiilis.this, "Tiedot tallennettu", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
