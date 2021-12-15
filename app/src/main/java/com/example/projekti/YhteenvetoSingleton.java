package com.example.projekti;


import java.util.ArrayList;
import java.util.Collections;


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
        Collections.reverse(yhteenvedot);
        return (yhteenvedot);
    }

}
