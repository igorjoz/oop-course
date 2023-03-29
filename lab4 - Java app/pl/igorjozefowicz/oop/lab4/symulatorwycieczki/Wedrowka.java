package pl.igorjozefowicz.oop.lab4.symulatorwycieczki;

/**
 * Wędrówka
 */
public abstract class Wedrowka implements ElementWycieczki {
    private double odleglosc;
    
    /**
     * @param odleglosc - długość wędrówki w GOTach
     */
    public Wedrowka(double odleglosc) {
        this.odleglosc = odleglosc;
    }

    public double getOdleglosc() {
        return odleglosc;
    }
    
    /**
     * Metoda odzwierciedla to jak dany teren wpływa na prędkość poruszania się grupy.
     * @param predkosc
     * @return 
     */
    public abstract double modyfikujPredkoscGrupy(double predkosc);
    
    /**
     * @return Trudność nawigacyjna terenu w skali 1-5 
     */
    public abstract int getTrudnoscNawigacyjna();
}
