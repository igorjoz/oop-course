package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wycieczka;

public class PrzewodnikSudecki extends PrzewodnikStudencki {
    public PrzewodnikSudecki(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public void opiszWycieczke(Wycieczka wycieczka) {
        mow("Drodzy sudeccy podróżnicy, proszę o uwagę! Teraz opowiem wam o naszej wyprawie");
        super.opiszWycieczke(wycieczka);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }
}
