package com.company;

public class Pełnoletnia {

    public static void main(String[] args) {
        Osoba1 tato = new Osoba1();
        tato.imie = "Jan";
        tato.nazwisko = "Kowalski";
        tato.wiek = 35;
        tato.wzrost = 150;
        tato.waga = 90;

        Osoba1 mama = new Osoba1();
        mama.wiek = 35;
        mama.waga = 65;

        Osoba1 córka = new Osoba1();
        córka.imie = "Ola";
        córka.nazwisko = "Kowalska";
        córka.wiek = 12;
        córka.wzrost = 200;
        córka.waga = 40;

        Rodzina rodzina = new Rodzina();
        rodzina.tata = tato;
        rodzina.mama = mama;
        rodzina.dziecko = córka;

        int lacznaWagaRodziny = rodzina.lacznaWaga();
//        metoda w klasie rodzina
        System.out.println("Rodzina waży łącznie: " + lacznaWagaRodziny + " kg.");

    }
}