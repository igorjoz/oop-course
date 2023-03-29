package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;

public class WychodnieSkalne extends Atrakcja {
    public WychodnieSkalne() {
        super(1 / 6);
    }

    @Override
    public String getNazwa() {
        return "Wychodnie skalne";
    }
}
