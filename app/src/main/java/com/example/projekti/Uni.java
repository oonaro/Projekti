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

public class Uni extends AppCompatActivity {

    EditText unenmaara;
    Button button;
    SharedPreferences sp;
    String unenmaaraStr;
    RadioGroup unenArvio;
    SeekBar seekBar;
    int seekBarStr;
    EditText unet;
    String unetStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);


            unenmaara = findViewById(R.id.editText_uniMaara);
            button = findViewById(R.id.UniTallenna);
            unenArvio = findViewById(R.id.radioGroup_uniTarpeeksi);
            seekBar = findViewById(R.id.seekBar_uniLaatu);
            unet = findViewById(R.id.EditText_unet);


        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unenmaaraStr = unenmaara.getText().toString();
                    seekBarStr = seekBar.getProgress();
                    unetStr = unet.getText().toString();


                    // get selected radio button from radioGroup
                    int selectedId = unenArvio.getCheckedRadioButtonId();

                    SharedPreferences.Editor editor = sp.edit();


                    if (selectedId == R.id.radioButton_uniKylla) {
                        editor.putString("unenarvio", "Kyllä");

                    } else if (selectedId == R.id.radioButton_uniEi) {
                        editor.putString("unenarvio", "Ei");

                    }


                    editor.putString("unenmaara", unenmaaraStr);
                    editor.putString("unenlaatu", String.valueOf(seekBarStr));
                    editor.putString("unet", unetStr);


                    Toast.makeText(getBaseContext(), "Tiedot tallennettu", Toast.LENGTH_SHORT).show();
                    editor.commit();
                    finish();

                }
            });

        }
    }

