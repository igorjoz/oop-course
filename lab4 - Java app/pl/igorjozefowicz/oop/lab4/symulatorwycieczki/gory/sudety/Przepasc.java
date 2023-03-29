package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;

public class Przepasc extends Atrakcja {
    public Przepasc() {
        super(1 / 6);
    }

    @Override
    public String getNazwa() {
        return "Przepaść";
    }
}
