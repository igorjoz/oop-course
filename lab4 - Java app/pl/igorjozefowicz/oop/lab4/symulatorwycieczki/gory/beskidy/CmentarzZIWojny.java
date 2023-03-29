package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;

public class CmentarzZIWojny extends Atrakcja {
    private final String miejscowosc;

    public CmentarzZIWojny(String miejscowosc) {
        super(0.5);
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String getNazwa() {
        return "Cmentarz z I wojny światowej (" + miejscowosc + ")";
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }
}
