package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Tähän projektin nimi
 * @author oonarosenblad
 * joku kommentti tässä
 */


public class MainActivity extends AppCompatActivity {

    private ImageButton buttonLiikunta;
    private ImageButton buttonUni;
    private ImageButton buttonRavinto;
    private ImageButton buttonFiilis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLiikunta = (ImageButton) findViewById(R.id.liikunta);
        buttonUni = (ImageButton) findViewById(R.id.Uni);
        buttonRavinto = (ImageButton) findViewById(R.id.Ravinto);
        buttonFiilis = (ImageButton) findViewById(R.id.Fiilis);


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
    }
}
