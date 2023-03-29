package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

public class CzlowiekZKontuzja extends Czlowiek {
    public CzlowiekZKontuzja(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 3, 18,12);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }
}
