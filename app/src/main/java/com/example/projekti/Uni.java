package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Uni extends AppCompatActivity {

    EditText unenmaara;
    Button button;
    SharedPreferences sp;
    String unenmaaraStr;
    RadioGroup unenArvio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);


            unenmaara = findViewById(R.id.editTextNumber2);
            button = findViewById(R.id.tallenna3);
            unenArvio = findViewById(R.id.radioGroup);

            sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unenmaaraStr = unenmaara.getText().toString();
                    // get selected radio button from radioGroup
                    int selectedId = unenArvio.getCheckedRadioButtonId();

                    SharedPreferences.Editor editor = sp.edit();


                    if (selectedId == R.id.radioButton) {
                        editor.putString("unenarvio", "Kyllä");

                    } else if (selectedId == R.id.radioButton2) {
                        editor.putString("unenarvio", "Ei");

                    }


                    editor.putString("unenmäärä", unenmaaraStr);

                    Toast.makeText(getBaseContext(), "Tiedot tallennettu", Toast.LENGTH_SHORT).show();
                    editor.commit();
                    finish();

                }
            });

        }
    }

