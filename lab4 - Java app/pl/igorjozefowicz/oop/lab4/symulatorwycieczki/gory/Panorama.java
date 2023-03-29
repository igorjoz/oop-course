package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;

public class Panorama extends Atrakcja {
    public Panorama() {
        super(1 / 6);
    }

    @Override
    public String getNazwa() {
        return "Panorama";
    }
}
