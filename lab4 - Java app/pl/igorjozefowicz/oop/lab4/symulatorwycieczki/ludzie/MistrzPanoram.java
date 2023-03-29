package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.Panorama;

public class MistrzPanoram extends Czlowiek {
    public MistrzPanoram(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 5, 18,18);
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja) {
        if (atrakcja instanceof Panorama) {
            regeneruj(2 * atrakcja.getCzasZwiedzania());
        } else {
            regeneruj(atrakcja.getCzasZwiedzania());
        }

        mow("Czy to panorama? Atrakcja: " + atrakcja.getNazwa());
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 4;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka wedrowka, double czas) {
        aktualizujZmeczenie(czas);
        mow("Chwila, a zdjęcie? Wędrówka: " + wedrowka.getNazwa());
    }
}
