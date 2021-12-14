package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListaSingleton {
    private ArrayList<String> tiedot;
    private static final ListaSingleton ourInstance = new ListaSingleton();

    public static ListaSingleton getInstance() {
        return ourInstance;
    }

    public ArrayList<String> getTiedot() {
        return tiedot;
    }

    public void addTieto(String tieto) {
        this.tiedot.add(tieto);
    }


}
