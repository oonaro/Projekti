package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Liikuntainfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liikuntainfo);
        TextView t1;

        t1 = findViewById(R.id.textView12);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);
        String name = sp.getString("name", "");

        t1.setText(name);
    }
}
