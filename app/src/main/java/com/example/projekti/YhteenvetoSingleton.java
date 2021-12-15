package com.example.projekti;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author Aleksi Alanko ja Oona Rosenblad
 * Liikutainfo-nakyman ListViewn luomiseen tarvitta singleton-luokka
 */

public class YhteenvetoSingleton{

    private static final YhteenvetoSingleton ourInstance = new YhteenvetoSingleton();

    private ArrayList<YhteenvetoTiedot> yhteenvedot;
    public static YhteenvetoSingleton getInstance(){
        return ourInstance;
    }

    private YhteenvetoSingleton(){
        yhteenvedot = new ArrayList<>();
    }

    /**
     * Metodi asettaa ArrayListiin Liikuntainfo-luokassa luodun olion
     * @param yhteenveto = Liikuntainfo-luokassa luotu olio
     */
    public void addYhteenveto(YhteenvetoTiedot yhteenveto){
        yhteenvedot.add(yhteenveto);
    }

    /**
     * @return Palauttaa luodun ArrayListin Liikuntainfo-nakymaan
     */
    public ArrayList<YhteenvetoTiedot> getYhteenveto(){
        return yhteenvedot;
    }

}
