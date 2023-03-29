package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory;


import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

/**
 * Przeprawa przez rzeke
 */
public class PrzeprawaPrzezRzeke extends Wedrowka {
    public PrzeprawaPrzezRzeke(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.1f * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 2;
    }

    @Override
    public String getNazwa() {
        return "PrzeprawaPrzezRzeke";
    }
}
