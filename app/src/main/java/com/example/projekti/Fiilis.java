package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fiilis extends AppCompatActivity {

    EditText fiilis;
    Button button;
    SharedPreferences sp;
    String fiilisStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiilis);



        fiilis = findViewById(R.id.editTextTextPersonName2);
        button = findViewById(R.id.tallenna2);

        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fiilisStr = fiilis.getText().toString();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("fiilis", fiilisStr);
                editor.commit();
                Toast.makeText(Fiilis.this, "Tiedot tallennettu", Toast.LENGTH_LONG).show();
                finish();


            }
        });

    }
}
