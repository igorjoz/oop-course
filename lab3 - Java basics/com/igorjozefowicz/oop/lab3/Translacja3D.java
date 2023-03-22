package com.igorjozefowicz.oop.lab3;

public class Translacja3D implements Transformacja3D {
    private final double dX, dY, dZ;
    public Translacja3D(double dX, double dY, double dZ) {
        this.dX = dX;
        this.dY = dY;
        this.dZ = dZ;
    }
    @Override
    public Transformacja3D getTransformacjaOdwrotna() {
        return new Translacja3D(-dX, -dY, -dZ);
    }
    @Override
    public Punkt3D transformuj3D(Punkt3D point) {
        return new Punkt3D(point.getX() + dX, point.getY() + dY, point.getZ() + dZ);
    }

    public double getdX() {
        return dX;
    }

    public double getdY() {
        return dY;
    }

    public double getdZ() {
        return dZ;
    }

    @Override
    public String toString() {
        return "Translacja o wektor (" + dX + ", " + dY + ", " + dZ + ")";
    }
}
