package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Uni extends AppCompatActivity {

    EditText unenmaara;
    Button button;
    SharedPreferences sp;
    String unenmaaraStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);


            unenmaara = findViewById(R.id.editTextNumber2);
            button = findViewById(R.id.tallenna3);

            sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unenmaaraStr = unenmaara.getText().toString();

                    SharedPreferences.Editor editor = sp.edit();

                    editor.putString("unenmäärä", unenmaaraStr);
                    editor.commit();
                    Toast.makeText(Uni.this, "Information saved", Toast.LENGTH_LONG).show();
                    finish();

                }
            });

        }
    }

