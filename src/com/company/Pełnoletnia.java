package com.company;

public class Pełnoletnia {

    public static void main(String[] args) {
        Osoba1 tato = new Osoba1();
        tato.imie = "Jan";
        tato.nazwisko = "Kowalski";
        tato.wiek = 35;

        Osoba1 córka = new Osoba1();
        córka.imie = "Ola";
        córka.nazwisko = "Kowalska";
        córka.wiek = 12;

        System.out.println(tato.pełnoletnia());
        System.out.println(córka.pełnoletnia());
    }
}