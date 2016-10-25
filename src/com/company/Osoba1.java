package com.company;


public class Osoba1 {
    String imie, nazwisko;
    int wiek, wzrost, waga;

    boolean pełnoletnia() {

        return wiek >= 18;
    }

    boolean wysoki() {
        return wzrost >= 180;
    }

}
