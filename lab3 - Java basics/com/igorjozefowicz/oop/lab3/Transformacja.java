package com.igorjozefowicz.oop.lab3;

public interface Transformacja{
    Punkt transformuj(Punkt p);
    Transformacja getTransformacjaOdwrotna()
            throws BrakTransformacjiOdwrotnejException;
}

