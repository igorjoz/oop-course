package pl.igorjozefowicz.oop.lab4.symulatorwycieczki;

public abstract class Atrakcja  implements ElementWycieczki {
    // [h] hours
    private double czasZwiedzania;

    protected Atrakcja(double czasZwiedzania) {
        this.czasZwiedzania = czasZwiedzania;
    }

    public double getCzasZwiedzania() {
        return this.czasZwiedzania;
    }
}
