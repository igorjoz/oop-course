package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory;


import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;


/**
 * Przejscie na przełaj przez las
 */
public class Las extends Wedrowka{
    public Las(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.5f * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 3;
    }

    @Override
    public String getNazwa() {
        return "Las";
    }
}
