package com.igorjozefowicz.oop.lab3;

public class ZlozenieTransformacji implements Transformacja {
    private final Transformacja[] transformacje;
    public ZlozenieTransformacji(Transformacja[] transformacje)
    {
        this.transformacje = transformacje;
    }
    @Override
    public Punkt transformuj(Punkt point)
    {
        for (Transformacja transformation : transformacje)
        {
            point = transformation.transformuj(point);
        }
        return point;
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException
    {
        Transformacja[] odwrotnosci = new Transformacja[transformacje.length];
        for (int i = 0; i < transformacje.length; i++)
        {
            odwrotnosci[transformacje.length-1-i] = transformacje[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(odwrotnosci);
    }
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Transformacja transformation : transformacje) {
            stringBuilder.append(transformation.toString()).append(", ");
        }
        return stringBuilder.toString();
    }
}
