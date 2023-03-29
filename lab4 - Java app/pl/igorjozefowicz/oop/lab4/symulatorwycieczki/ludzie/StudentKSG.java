package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.ludzie;


import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Wedrowka;
import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.PrzeprawaPrzezRzeke;


public class StudentKSG extends Student{

    public StudentKSG(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public void reagujNaWedrowke(Wedrowka wedrowka, double czas) {
        if(wedrowka instanceof PrzeprawaPrzezRzeke) {
            mow("Uuu! Przeprawa przez rzekę. Gdybym tylko miał podręczną sondę hydrologiczną, to mógłbym pomierzyć EC i pH do pracy magisterskiej.");
            aktualizujZmeczenie(czas);
        }
        else
            super.reagujNaWedrowke(wedrowka, czas);
    }
}
