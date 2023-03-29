package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.PrzeprawaPrzezRzeke;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.ZalanyLas;

public class Hydrolog extends Czlowiek {
    public Hydrolog(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko,plec, 6, 18,18);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka wedrowka, double czas) {
        super.reagujNaWedrowke(wedrowka, czas);

        if (wedrowka instanceof PrzeprawaPrzezRzeke || wedrowka instanceof ZalanyLas) {
            mow("Uuu, woda! Muszę wykorzystać tę okazję. Zbiorę dane o przewodności i pH wody!!");
        }
    }
}
