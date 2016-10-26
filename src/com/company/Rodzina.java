package com.company;

import java.util.ArrayList;

public class Rodzina {

    private Osoba mama;
    private Osoba tata;
//    Osoba dziecko;
    private ArrayList<Osoba> dzieci;

//    poniżej final: dodany do deklaracji zmiennej blokuje nam możliwość zmiany zmiennej; jej wartością pozostaje
//    ta wartość, która została jej nadana jako pierwsza

    public Rodzina(Osoba mamaRodzic, Osoba tataRodzic, final ArrayList<Osoba> dzieci) {
        mama = mamaRodzic;
        tata = tataRodzic;
        this.dzieci = new ArrayList<>();
    }

//    to jest konstruktor: on wymusza na programiście, który korzysta z danej klasy wprowadzenie danych obiektów
//    (wymusza na programiście poprawne używanie danej klasy):
//    public Rodzina(Osoba mama, Osoba tata, ArrayList<Osoba> dzieci) {
//        this.mama = mama;
//        this.tata = tata;
//        this.dzieci = dzieci;
//    }
//    ALBO:
//    public Rodzina(Osoba mama1, Osoba tata1, ArrayList<Osoba> dzieci1) {
//        mama = mama1;
//        tata = tata1;
//        dzieci = dzieci1;
//    }


    public int lacznaWaga() {
        int size = this.dzieci.size();
        int waga = mama.PobierzWagę() + tata.PobierzWagę();
        for(int k=0; k < size; k++) {
            Osoba dziecko = this.dzieci.get(k);
            waga += dziecko.PobierzWagę();
        }
        return waga;
    }
}
