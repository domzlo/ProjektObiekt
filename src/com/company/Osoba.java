package com.company;

public class Osoba {

    private String imie, nazwisko;
    private int wiek, wzrost, waga;

    public Osoba(String imie, String nazwisko, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.waga = waga;
    }
//
//    poniżej: po enkapsulacji pól nie możemy się do nich dobrać licząc wagę rodziny w pliku Rodzina.
//    Musimy zrobić tu metodę, która umożliwi nam przekazanie jej na zewnątrz.
    public String PobierzImię() {
        return imie;
    }
    public String PobierzNazwisko() {
        return nazwisko;
    }
    public int PobierzWagę() {
        return waga;
    }

    boolean pełnoletnia() {

        return wiek >= 18;
    }
}
