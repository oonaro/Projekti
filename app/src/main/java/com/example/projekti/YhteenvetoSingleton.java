package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class YhteenvetoSingleton{

    private static final YhteenvetoSingleton ourInstance = new YhteenvetoSingleton();

    private ArrayList<YhteenvetoTiedot> yhteenvedot;
    public static YhteenvetoSingleton getInstance(){
        return ourInstance;
    }

    private YhteenvetoSingleton(){
        yhteenvedot = new ArrayList<>();
    }

    public void addYhteenveto(YhteenvetoTiedot yhteenveto){
        yhteenvedot.add(yhteenveto);
    }

    public ArrayList<YhteenvetoTiedot> getYhteenveto(){
        return yhteenvedot;
    }

}
