package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ravinto extends AppCompatActivity {

    EditText ruoka;
    EditText kalorit;
    Button tallenna;
    SharedPreferences sp;
    String ruokaStr;
    String kaloritStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ravinto);

        ruoka = findViewById(R.id.editText_ruoka);
        kalorit = findViewById(R.id.editText_kalorit);
        tallenna = findViewById(R.id.button_tallenna);

        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

        tallenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ruokaStr = ruoka.getText().toString();
                kaloritStr = kalorit.getText().toString();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("ruoka", ruokaStr);
                editor.putString("kalorit", kaloritStr);
                editor.commit();
                Toast.makeText(Ravinto.this, "Tiedot tallennettu", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}