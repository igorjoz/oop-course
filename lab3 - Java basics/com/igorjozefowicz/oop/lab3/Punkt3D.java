package com.igorjozefowicz.oop.lab3;

public class Punkt3D extends Punkt {
    private double x;
    private double y;
    private final double z;

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Punkt3D) {
            return x == ((Punkt3D) obj).x && y == ((Punkt3D) obj).y && z == ((Punkt3D) obj).z;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
