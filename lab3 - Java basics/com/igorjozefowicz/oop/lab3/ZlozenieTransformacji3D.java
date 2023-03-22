package com.igorjozefowicz.oop.lab3;

public class ZlozenieTransformacji3D implements Transformacja3D {
    private final Transformacja3D[] transformacje3D;

    public ZlozenieTransformacji3D(Transformacja3D[] transformacje3D) {
        this.transformacje3D = transformacje3D;
    }

    @Override
    public Punkt3D transformuj3D(Punkt3D point)
    {
        for (Transformacja3D transformation3D : transformacje3D)
        {
            point = (Punkt3D) transformation3D.transformuj3D(point);
        }
        return point;
    }
    @Override
    public Transformacja3D getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException
    {
        Transformacja3D[] odwrotnosci = new Transformacja3D[transformacje3D.length];
        for (int i = 0; i < transformacje3D.length; i++)
        {
            odwrotnosci[transformacje3D.length - 1 - i] = transformacje3D[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji3D(odwrotnosci);
    }
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Transformacja3D transformation : transformacje3D) {
            stringBuilder.append(transformation.toString()).append(", ");
        }

        return stringBuilder.toString();
    }
}
