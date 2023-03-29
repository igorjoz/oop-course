package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class BlotnistaDroga extends Wedrowka {
    public BlotnistaDroga(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.9f * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }

    @Override
    public String getNazwa() {
        return "Błotnista droga";
    }
}
