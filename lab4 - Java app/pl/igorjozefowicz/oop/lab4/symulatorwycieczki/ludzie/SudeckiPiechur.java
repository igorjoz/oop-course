package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;

public class SudeckiPiechur extends Czlowiek {
    public SudeckiPiechur(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 6, 20,20);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka wedrowka, double czas) {
        aktualizujZmeczenie(czas);
        mow("Marszem, wędrówka: " + wedrowka.getNazwa());
    }
}
