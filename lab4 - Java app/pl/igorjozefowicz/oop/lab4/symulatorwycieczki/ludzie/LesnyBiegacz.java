package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ElementWycieczki;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wycieczka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.Panorama;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy.CmentarzZIWojny;

public class LesnyBiegacz extends Czlowiek {
    public LesnyBiegacz(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 6, 12,20);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka wedrowka, double czas) {
        aktualizujZmeczenie(czas);
        mow("Biegiem, wędrówka: " + wedrowka.getNazwa());
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja) {
        if (atrakcja instanceof CmentarzZIWojny) {
            regeneruj(2 * atrakcja.getCzasZwiedzania());
        } else {
            regeneruj(atrakcja.getCzasZwiedzania());
        }

        mow("Koniec biegania? Atrakcja: " + atrakcja.getNazwa());
    }
}
