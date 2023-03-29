package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class BagnoGorskie extends Wedrowka {
    public BagnoGorskie(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc * 0.5;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 2;
    }
    @Override
    public String getNazwa() {
        return "Bagno górskie";
    }
}
