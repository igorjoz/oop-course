package com.igorjozefowicz.oop.lab3;

import com.igorjozefowicz.oop.lab3.Punkt;
import  com.igorjozefowicz.oop.lab3.BrakTransformacjiOdwrotnejException;

public interface Transformacja{
    Punkt transformuj(Punkt p);
    Transformacja getTransformacjaOdwrotna()
            throws BrakTransformacjiOdwrotnejException;
}

