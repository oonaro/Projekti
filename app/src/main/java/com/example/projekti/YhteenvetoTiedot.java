package com.example.projekti;

import java.util.Calendar;

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
