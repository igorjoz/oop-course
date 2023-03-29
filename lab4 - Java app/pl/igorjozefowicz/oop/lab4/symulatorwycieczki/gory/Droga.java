package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class Droga extends Wedrowka {

    public Droga(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        //Brak modyfikacji
        return predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }    

    @Override
    public String getNazwa() {
        return "Droga";
    }
    
}
