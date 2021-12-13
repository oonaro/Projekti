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
        TextView t2;
        TextView t3;

        t1 = findViewById(R.id.textView12);
        t2 = findViewById(R.id.textView9);
        t3 = findViewById(R.id.textView13);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Nimi tähä", Context.MODE_PRIVATE);
        String liikuntaminuutit = sp.getString("liikuntaminuutit", "");
        String fiilis = sp.getString("fiilis", "");
        String unenmaara = sp.getString("unenmäärä", "");



        t1.setText(liikuntaminuutit);
        t2.setText(fiilis);
        t3.setText(unenmaara);
    }
}
