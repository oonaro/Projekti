package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;

public class Liikunta extends AppCompatActivity {

    EditText arkiliikunta;
    Button button;
    SharedPreferences sp;
    String arkiliikuntaStr;
    SeekBar seekBar;
    int seekBarStr;
    EditText aktiiviliikunta;
    String aktiiviliikuntaStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikunta);


        arkiliikunta = findViewById(R.id.editText_arkiliikunta);
        aktiiviliikunta = findViewById(R.id.editText_aktiiviliikunta);
        button = findViewById(R.id.tallenna);
        seekBar = findViewById(R.id.seekBar2);

        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arkiliikuntaStr = arkiliikunta.getText().toString();
                aktiiviliikuntaStr = aktiiviliikunta.getText().toString();
                seekBarStr = seekBar.getProgress();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("liikuntaminuutit", arkiliikuntaStr);
                editor.putString("askeleet", String.valueOf(seekBarStr));

                editor.commit();
                Toast.makeText(Liikunta.this, "Tiedot tallennettu", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
