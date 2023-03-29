package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class ZalanyLas extends Wedrowka {
    public ZalanyLas(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.25f * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 4;
    }

    @Override
    public String getNazwa() {
        return "Zalany las";
    }
}
