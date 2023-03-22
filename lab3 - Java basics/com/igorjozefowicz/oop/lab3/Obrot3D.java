package com.igorjozefowicz.oop.lab3;

public class Obrot3D implements Transformacja3D {
    private double kat;
    public Obrot3D(double kat) {
        this.kat = kat;
    }
    @Override
    public Punkt3D transformuj3D(Punkt3D p) {
        return new Punkt3D(
                p.getX(),
                p.getY() * Math.cos(Math.toRadians(kat)) - p.getZ() * Math.sin(Math.toRadians(kat)),
                p.getY() * Math.sin(Math.toRadians(kat)) + p.getZ() * Math.cos(Math.toRadians(kat))
        );
    }
    @Override
    public Transformacja3D getTransformacjaOdwrotna() {
        return new Obrot3D(-kat);
    }
    public double getKat() {
        return kat;
    }
    @Override
    public String toString() {
        return "Obrot o " + kat + " stopni";
    }
}
