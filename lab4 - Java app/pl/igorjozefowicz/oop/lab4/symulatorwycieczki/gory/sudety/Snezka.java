package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;


public class Snezka extends Wedrowka {
    public Snezka(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc * 0.8;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }
    @Override
    public String getNazwa() {
        return "Snieżka";
    }
}
