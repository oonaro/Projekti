package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

public class Ravinto extends AppCompatActivity {

    EditText ruoka;
    EditText kalorit;
    Button tallenna;
    SharedPreferences sp;
    String ruokaStr;
    String kaloritStr;
    RadioGroup kalorisuositus;
    SeekBar seekBar;
    SeekBar seekBar2;
    int seekBarStr;
    int seekBarStr2;
    RadioGroup vesi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ravinto);

        ruoka = findViewById(R.id.editText_ruoka);
        kalorit = findViewById(R.id.editText_kalorit);
        tallenna = findViewById(R.id.button_tallenna);
        kalorisuositus = findViewById(R.id.kalorisuositus);
        seekBar = findViewById(R.id.seekBar_tarpeeksi);
        seekBar2 = findViewById(R.id.seekBar_terveellisesti);
        vesi = findViewById(R.id.vettaRiittavasti);



        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

        tallenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ruokaStr = ruoka.getText().toString();
                kaloritStr = kalorit.getText().toString();
                seekBarStr = seekBar.getProgress();
                seekBarStr2 = seekBar2.getProgress();



                // get selected radio button from radioGroup
                int selectedId = kalorisuositus.getCheckedRadioButtonId();

                SharedPreferences.Editor editor = sp.edit();


                if (selectedId == R.id.radioButton_kylla) {
                    editor.putString("kalorisuositus", "Kyllä");

                } else if (selectedId == R.id.radioButton_ei) {
                    editor.putString("kalorisuositus", "Ei");

                }


                // get selected radio button from radioGroup
                int selectedIdVesi = vesi.getCheckedRadioButtonId();

                if (selectedIdVesi == R.id.radioButton_vettaKylla) {
                    editor.putString("vesi", "Kyllä");

                } else if (selectedIdVesi == R.id.radioButton_vettaEi) {
                    editor.putString("vesi", "Ei");

                }


                editor.putString("ruoka", ruokaStr);
                editor.putString("kalorit", kaloritStr);
                editor.putString("tarpeeksi", String.valueOf(seekBarStr));
                editor.putString("terveellisesti", String.valueOf(seekBarStr2));


                editor.commit();
                Toast.makeText(Ravinto.this, "Tiedot tallennettu", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}