package pl.igorjozefowicz.oop.lab4.symulatorwycieczki.gory.sudety;

import pl.igorjozefowicz.oop.lab4.symulatorwycieczki.Atrakcja;

public class ObserwatoriumMetrologiczne extends Atrakcja {
    public ObserwatoriumMetrologiczne() {
        super(1);
    }

    @Override
    public String getNazwa() {
        return "Obserwatorium metrologiczne na szczycie Śnieżki";
    }
}
