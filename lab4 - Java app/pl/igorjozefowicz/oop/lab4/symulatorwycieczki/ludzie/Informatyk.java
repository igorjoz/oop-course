package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class Informatyk extends Czlowiek {
    public Informatyk(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 5, 18,18);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 4;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka wedrowka, double czas) {
        aktualizujZmeczenie(czas);
        mow("Laptop mi się rozładowuje, wędrówka: " + wedrowka.getNazwa());
    }
}
