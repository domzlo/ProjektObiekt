package com.company;
import java.util.ArrayList;

public class CałaRodzina {

    public static void main(String[] args) {
        Osoba tata = new Osoba();
        tata.imie = "Jan";
        tata.nazwisko = "Kowalski";
        tata.wiek = 35;
        tata.wzrost = 150;
        tata.waga = 90;

        Osoba mama = new Osoba();
        mama.wiek = 35;
        mama.waga = 65;

        Osoba córka = new Osoba();
        córka.imie = "Ola";
        córka.nazwisko = "Kowalska";
        córka.wiek = 12;
        córka.wzrost = 200;
        córka.waga = 40;

        Osoba syn = new Osoba();
        syn.imie = "Janek";
        syn.nazwisko = "Kowalski";
        syn.wiek = 18;
        syn.wzrost = 170;
        syn.waga = 80;

        ArrayList<Osoba> dzieci = new ArrayList<>();
        dzieci.add(córka);
        dzieci.add(syn);

        Rodzina rodzina = new Rodzina(mama, tata, dzieci);
        rodzina.tata = tata;
        rodzina.mama = mama;
//        rodzina.dziecko = córka;
//        rodzina.dziecko = syn;
//        rodzina.dzieci = dzieci;

        int lacznaWagaRodziny = rodzina.lacznaWaga();
//        metoda w klasie rodzina
        System.out.println("Rodzina waży łącznie: " + lacznaWagaRodziny + " kg.");

    }
}