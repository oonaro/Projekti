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
import android.widget.Toast;

public class Liikunta extends AppCompatActivity {

    EditText liikuntaminuutit;
    Button button;
    SharedPreferences sp;
    String liikuntaminuutitStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikunta);


        liikuntaminuutit = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.tallenna);

        sp = getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liikuntaminuutitStr = liikuntaminuutit.getText().toString();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("liikuntaminuutit", liikuntaminuutitStr);
                editor.commit();
                Toast.makeText(Liikunta.this, "Information saved", Toast.LENGTH_LONG).show();
                finish();


            }
        });

    }
}
