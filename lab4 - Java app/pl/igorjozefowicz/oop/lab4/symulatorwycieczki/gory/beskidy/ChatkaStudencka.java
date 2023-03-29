package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.beskidy;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;

public class ChatkaStudencka extends Atrakcja {
    private final String koloStudenckie;

    public ChatkaStudencka(String koloStudenckie) {
        super(0.5);
        this.koloStudenckie = koloStudenckie;
    }

    @Override
    public String getNazwa() {
        return "Catka studencka utrzymywana przez " + koloStudenckie;
    }

    public String getKoloStudenckie() {
        return koloStudenckie;
    }
}
