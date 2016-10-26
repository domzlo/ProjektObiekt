package com.company;

import java.util.ArrayList;

public class Rodzina {

    Osoba1 mama;
    Osoba1 tata;
    Osoba1 dziecko;
    ArrayList<Osoba1> dzieci;

    public int size = dzieci.size();

    public int lacznaWaga() {
        for(int k=0; k <= size; k++) {
            Osoba1 dziecko = dzieci.get(k);
            int wagaDziecka = dziecko.waga;
            System.out.println(wagaDziecka);
        }

//        return mama.waga + tata.waga + dziecko.waga;



    }



}
