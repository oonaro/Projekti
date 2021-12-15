package com.example.projekti;

import java.util.Calendar;
import java.util.Collections;

/**
 * Elamantapapaivakirja
 * YhteenvetoTiedot luokka
 * @author oonarosenblad
 * luokka jossa tiedot haetaan liikuntainfo luokasta ja talletetaan Yhteenveto tiedot listalle muuttujana
 */

public class YhteenvetoTiedot {

    String unenmaara;
    String ruoka;
    String liikuntaminuutit;
    String liikuntaminuutit2;
    String askeleet;
    String unenarvio;
    String unenlaatu;
    String unet;
    String kalorit;
    String kalorisuositus;
    String terveellisesti;
    String tarpeeksi;
    String vesi;
    String fiilisasteikko;
    String fiilis;
    String date;


    /**
     *
     * @param unenmaara = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param ruoka = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param liikuntaminuutit = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param liikuntaminuutit2 = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param unenarvio = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param unenlaatu = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param unet = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param kalorit = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param kalorisuositus = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param terveellisesti = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param tarpeeksi = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param vesi = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param fiilisasteikko = kayttajan asettama tieto, haettu Liikuntainfo luokastaa
     * @param fiilis = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     * @param date = kayttajan asettama tieto, haettu Liikuntainfo luokasta
     *
     */

    public YhteenvetoTiedot(String date, String ruoka, String liikuntaminuutit, String liikuntaminuutit2, String unenmaara, String askeleet, String unenarvio, String unenlaatu, String unet, String kalorit, String kalorisuositus, String terveellisesti, String tarpeeksi, String vesi, String fiilisasteikko, String fiilis) {
        this.unenmaara = unenmaara;
        this.ruoka = ruoka;
        this.liikuntaminuutit = liikuntaminuutit;
        this.liikuntaminuutit2 = liikuntaminuutit2;
        this.askeleet = askeleet;
        this.unenarvio = unenarvio;
        this.unenlaatu = unenlaatu;
        this.unet = unet;
        this.kalorit = kalorit;
        this.kalorisuositus = kalorisuositus;
        this.terveellisesti = terveellisesti;
        this.tarpeeksi = tarpeeksi;
        this.vesi = vesi;
        this.fiilisasteikko = fiilisasteikko;
        this.fiilis = fiilis;
        this.date = date;
    }

    /**
     * Hakee arvot (Stringit) Liikuntainfo luokasta ja tekee niista lista olion, joka saa
     * parametreina haetut arvot
     * */

    @Override
    public String toString(){
        return date +"\n\nLiikunta:\n\nArkiliikunta: " + liikuntaminuutit + " min\nAktiiviliikunta: " + liikuntaminuutit2 +
                " min\nNoin " + askeleet + " 000 askelta\n\nRavinto:\n\nPäivän ruoka: " + ruoka
                + "\nKalorit: " + kalorit + " kaloria\nTäyttyikö kalorisuositus: " + kalorisuositus
                + "\nRuoan terveellisyys: " + terveellisesti + "/11\nRuoan riittävyys: " + tarpeeksi
                + "/11\nJoitko tarpeeksi vettä: " + vesi + "\n\nUni:\n\nUnen määrä: " + unenmaara
                + " tuntia\nNukuitko tarpeeksi: " + unenarvio + "\nUnen laatu: " + unenlaatu
                + "/11\nUnet: " + unet + "\n\nFiilis:\n\nArvio päivän fiiliksestä: " + fiilisasteikko
                + "/5\n" + fiilis;
    }

}
