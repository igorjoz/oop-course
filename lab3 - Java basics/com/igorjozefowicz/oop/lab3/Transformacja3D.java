package com.igorjozefowicz.oop.lab3;

public interface Transformacja3D {
    Punkt transformuj3D(Punkt3D point);
    Transformacja3D getTransformacjaOdwrotna()
            throws BrakTransformacjiOdwrotnejException;
}
