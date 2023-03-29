package pl.igorjozefowicz.oop.lab4;

import java.util.HashSet;
import java.util.Set;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.*;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.*;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy.ChatkaStudencka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy.CmentarzZIWojny;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety.ObserwatoriumMetrologiczne;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety.Przepasc;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety.Snezka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety.WychodnieSkalne;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie.*;


public class lab4 {
    public static void main(String[] args) {
        //Wycieczka wycieczka = naSnezke();
        Wycieczka wycieczka = naSnezke2();

        PrzewodnikStudencki przewodnik = new PrzewodnikSudecki("Maciej", "Bosonogi", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new Hydrolog("Bartek", "Wodnisty", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new MistrzPanoram("Adam","Bezlusterkowy", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new CzlowiekZKontuzja("Dorota", "Skontuzjowana", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new LesnyBiegacz("Alan","Biegowy", Czlowiek.Plec.MEZCZYZNA));
        //uczestnicy.add(new SudeckiPiechur("Piotr","Piechur", Czlowiek.Plec.MEZCZYZNA));
        //uczestnicy.add(new Informatyk("Karol","Binarny", Czlowiek.Plec.MEZCZYZNA));

        Grupa grupa = new Grupa(przewodnik, uczestnicy);

        SymulatorWycieczki symulator = new SymulatorWycieczki(grupa, wycieczka);

        symulator.dodajSluchaczaPostepow((ElementWycieczki elementWycieczki, int lp, int liczbaElementow) -> {
            int numerElementu = lp + 1;

            System.out.println();
            System.out.println("Pasek postępu: " + numerElementu + " / " + liczbaElementow);
            System.out.println();
        });

        symulator.symuluj();
    }

    public static Wycieczka naSnezke() {
        Wycieczka ret = new Wycieczka("Na Śnieżkę");
        ret.dodajElementWycieczki(new Droga(2.0));
        ret.dodajElementWycieczki(new Las(3.0));
        ret.dodajElementWycieczki(new Przepasc());
        ret.dodajElementWycieczki(new Snezka(6.0));
        ret.dodajElementWycieczki(new ObserwatoriumMetrologiczne());
        ret.dodajElementWycieczki(new WychodnieSkalne());
        ret.dodajElementWycieczki(new WychodnieSkalne());
        ret.dodajElementWycieczki(new Przepasc());
        ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
        ret.dodajElementWycieczki(new Las(3.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Koterka"));
        ret.dodajElementWycieczki(new Droga(2.0));

        return ret;
    }

    public static Wycieczka naSnezke2() {
        Wycieczka ret = new Wycieczka("Na Śnieżkę v2");
        ret.dodajElementWycieczki(new Droga(2.0));
        ret.dodajElementWycieczki(new CmentarzZIWojny("Karpacz"));
        ret.dodajElementWycieczki(new BlotnistaDroga(1.0));
        ret.dodajElementWycieczki(new ZalanyLas(3.0));
        ret.dodajElementWycieczki(new ChatkaStudencka("Koło Wspinaczki Górskiej Politechniki Gdańskiej"));
        ret.dodajElementWycieczki(new Przepasc());
        ret.dodajElementWycieczki(new Snezka(6.0));
        ret.dodajElementWycieczki(new ObserwatoriumMetrologiczne());
        ret.dodajElementWycieczki(new Panorama());
        ret.dodajElementWycieczki(new WychodnieSkalne());
        ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
        ret.dodajElementWycieczki(new Las(3.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Koterka"));
        ret.dodajElementWycieczki(new Droga(2.0));

        return ret;
    }
}
