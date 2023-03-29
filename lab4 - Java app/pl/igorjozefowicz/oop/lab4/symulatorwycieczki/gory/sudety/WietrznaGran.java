package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class WietrznaGran extends Wedrowka {
    public WietrznaGran(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc * (2/3);
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }
    @Override
    public String getNazwa() {
        return "Wietrzna Grań";
    }
}
