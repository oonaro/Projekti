package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Tähän projektin nimi
 * @author oonarosenblad
 * joku kommentti tässä
 */


public class MainActivity extends AppCompatActivity implements Dialog.DialogListener{

    private ImageButton buttonLiikunta;
    private ImageButton buttonUni;
    private ImageButton buttonRavinto;
    private ImageButton buttonFiilis;
    private ImageButton imageButton;



    private TextView tvPituus;
    private TextView tvPaino;
    private TextView tvIka;
    private TextView tvNimi;
    private Button muutaTietoja;
    private String prefPituus;
    private String prefPaino;
    private String prefIka;
    private String prefNimi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLiikunta = (ImageButton) findViewById(R.id.liikunta);
        buttonUni = (ImageButton) findViewById(R.id.Uni);
        buttonRavinto = (ImageButton) findViewById(R.id.Ravinto);
        buttonFiilis = (ImageButton) findViewById(R.id.Fiilis);
        imageButton = findViewById(R.id.tarkastele);


        SharedPreferences prefGet = getSharedPreferences("Info", MODE_PRIVATE);
        SharedPreferences sp = getSharedPreferences("Start", MODE_PRIVATE);
        boolean start= sp.getBoolean("Once", true);

        if (start){
            openDialog();
            SharedPreferences sps = getSharedPreferences("Once", MODE_PRIVATE);
            SharedPreferences.Editor spsEditor = sps.edit();
            spsEditor.putBoolean("Once", false);
            spsEditor.commit();
        }

        tvPituus = (TextView) findViewById(R.id.tv_pituus);
        tvPaino = (TextView) findViewById(R.id.tv_paino);
        tvIka = (TextView) findViewById(R.id.tv_ika);
        tvNimi = (TextView) findViewById(R.id.tv_nimi);
        muutaTietoja = (Button) findViewById(R.id.muutaTietoja);

        muutaTietoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        tvNimi.setText(prefGet.getString("prefNimi", "Nimi"));
        tvPituus.setText(prefGet.getString("prefPituus", "Pituus"));
        tvPaino.setText(prefGet.getString("prefPaino", "Paino"));
        tvIka.setText(prefGet.getString("prefIka", "Ikä"));


        /**
         * Ensimmäisen activityn avaaminen
         */

        buttonLiikunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Liikunta.class);
                startActivity(intent);

            }
        });

        /**
         * Toisen activityn avaaminen imagebuttonia painamalla
         */

        buttonUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Uni.class);
                startActivity(intent);

            }
        });

        /**
         * Kolmannen activityn avaaminen imagebuttonia painamalla
         */


        buttonRavinto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Ravinto.class);
                startActivity(intent);

            }
        });

        /**
         * Neljännen activityn avaaminen imagebuttonia painamalla
         */
        buttonFiilis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Fiilis.class);
                startActivity(intent);


            }
        });


        /**
         * Tietojen tarkastelu activityn avaaminen imagebuttonia painamalla
         */

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Liikuntainfo.class);
                startActivity(intent);
            }
        });
    }



    /**
     * Tietoikkunan avaamiseen käytetty metodi
     */

    public void openDialog(){
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(), "dialog");
    }

    /**
     *
     * @param pituus = käyttäjän asettama pituusmuuttuja
     * @param paino = käyttäjän asettama painomuuttuja
     * @param ika = käyttäjän asettama ikämuuttuja
     * @param nimi = käyttäjän asettama ikämuuttuja
     *
     * Arvojen hakeminen Dialog-luokasta ja niiden tulostaminen näytölle
     */

    @Override
    public void getInfo(String pituus, String paino, String ika, String nimi) {

        tvNimi.setText("Hei, " + nimi);
        tvPituus.setText("Pituus: " + pituus + "cm");
        tvPaino.setText("Paino: " + paino + "kg");
        tvIka.setText("Ikä: " + ika);
        prefPituus = pituus;
        prefPaino = paino;
        prefIka = ika;
        prefNimi = nimi;
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefPut = getSharedPreferences("Info", MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = prefPut.edit();
        prefEditor.putString("prefPituus", prefPituus);
        prefEditor.putString("prefPaino", prefPaino);
        prefEditor.putString("prefIka", prefIka);
        prefEditor.putString("prefNimi", prefNimi);
        prefEditor.commit();
    }
}
