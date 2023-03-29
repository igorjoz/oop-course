package pl.igorjozefowicz.oop.lab4.symulatorwycieczki;

import java.util.HashSet;
import java.util.Set;

public class SymulatorWycieczki {
    private Grupa grupa;
    private Wycieczka wycieczka;
    private int pozycjaGrupy = 0;
    private double czasWycieczki = 0.0;
    private double pokonanyDystans = 0.0;
    private Set<SluchaczPostepow> sluchaczePostepow = new HashSet<SluchaczPostepow>();

    public SymulatorWycieczki(Grupa grupa, Wycieczka wycieczka) {
        this.grupa = grupa;
        this.wycieczka = wycieczka;
    }
    
    public void symuluj() {
        System.out.println("===Symulator Wycieczki===");
        System.out.println();
        System.out.println("Na wycieczkę idzie następująca grupa: ");
        for(Uczestnik uczestnik : grupa.getUczestnicy()) {
            System.out.println(uczestnik);
        }
        System.out.println();
        System.out.println("Przedownikiem jest "+grupa.getPrzewodnik());
        System.out.println();
        System.out.println("Przewodnik opowie teraz grupie o wycieczce");
        
        grupa.getPrzewodnik().opiszWycieczke(wycieczka);
        
        System.out.println();
        System.out.println("Grupa wyruszyła!");
        System.out.println();
        
        for (pozycjaGrupy = 0; pozycjaGrupy < wycieczka.getLiczbaElementowWycieczki(); pozycjaGrupy++) {
            ElementWycieczki elementWycieczki = wycieczka.getElementWycieczki(pozycjaGrupy);
            
            if (elementWycieczki instanceof Wedrowka) {
                Wedrowka wedrowka = (Wedrowka) elementWycieczki;

                System.out.println("Grupa wędruje po terenie: " + wedrowka.getNazwa());
                
                double predkoscGrupy = grupa.getPredkosc();
                predkoscGrupy = wedrowka.modyfikujPredkoscGrupy(predkoscGrupy);
                int brakiNawigacyjne = wedrowka.getTrudnoscNawigacyjna() - grupa.getPrzewodnik().getUmiejetnosciNawigacyjne();

                if (brakiNawigacyjne < 0) {
                    brakiNawigacyjne = 0;
                }
                
                if (brakiNawigacyjne > 0) {
                    System.out.println("Przewodnik nieco się pogubił.");
                    double kara = brakiNawigacyjne / 5.0;
                    predkoscGrupy = (1.0 - kara) * predkoscGrupy;
                }
                
                if(predkoscGrupy <= Double.MIN_VALUE) {
                    System.out.println("Grupa nie jest w stanie iść dalej. Będzie nocowała w tym miejscu.");
                    break;
                }
                
                System.out.println("Grupa porusza się z prędkością " + predkoscGrupy + " GOT/h");
                
                double czas = wedrowka.getOdleglosc() / predkoscGrupy;
                
                for (Uczestnik uczestnik : grupa.getUczestnicy()) {
                    uczestnik.reagujNaWedrowke(wedrowka, czas);
                }
                
                System.out.println("Wędrówka zajęła grupie " + czas + " h");
                czasWycieczki += czas;
                pokonanyDystans += wedrowka.getOdleglosc();
            } else if (elementWycieczki instanceof Atrakcja) {
                Atrakcja atrakcja = (Atrakcja) elementWycieczki;

                System.out.println("Grupa zwiedza atrakcję: " + atrakcja.getNazwa());

                for (Uczestnik uczestnik : grupa.getUczestnicy()) {
                    uczestnik.reagujNaAtrakcje(atrakcja);
                }

                double czasZwiedzania = atrakcja.getCzasZwiedzania();

                System.out.println("Atrakcja zajęła grupie " + czasZwiedzania + " h");
                czasWycieczki += czasZwiedzania;
            }

            for (SluchaczPostepow sluchaczPostepow : sluchaczePostepow) {
                sluchaczPostepow.aktualizujPostep(elementWycieczki, pozycjaGrupy, wycieczka.getLiczbaElementowWycieczki());
            }
            
            System.out.println();
        }

        System.out.printf("Trasa zajęła grupie %.2f h, przeszli oni %.2f GOT.\n", czasWycieczki, pokonanyDystans);
        System.out.println("===Koniec symulacji===");
    }

    public void dodajSluchaczaPostepow(SluchaczPostepow sluchaczPostepow) {
        this.sluchaczePostepow.add(sluchaczPostepow);
    }
}
