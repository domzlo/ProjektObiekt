package com.company;

public class Rodzina {

    Osoba1 mama;
    Osoba1 tata;
    Osoba1 dziecko;
//    nie trzeba zawsze new?

    public int lacznaWaga(){
        return mama.waga + tata.waga + dziecko.waga;
    }

}
