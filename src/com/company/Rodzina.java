package com.company;

import java.util.ArrayList;

public class Rodzina {

    Osoba1 mama;
    Osoba1 tata;
    Osoba1 dziecko;
    ArrayList<Osoba1> dzieci;



    public int lacznaWaga() {
        int size = dzieci.size();
        int waga = mama.waga + tata.waga;
        for(int k=0; k < size; k++) {
            Osoba1 dziecko = dzieci.get(k);
            waga += dziecko.waga;
        }
        return waga;



    }



}
