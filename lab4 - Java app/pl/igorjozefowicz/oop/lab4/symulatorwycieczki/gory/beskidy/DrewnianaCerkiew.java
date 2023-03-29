package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy;


import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;


public class DrewnianaCerkiew extends Atrakcja {
    private final String miejscowosc;

    public DrewnianaCerkiew(String miejscowosc) {
        super(0.5);
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String getNazwa() {
        return "Drewniana cerkiew (" + miejscowosc + ")";
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }
}
