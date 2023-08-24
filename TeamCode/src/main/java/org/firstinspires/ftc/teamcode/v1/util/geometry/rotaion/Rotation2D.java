package org.firstinspires.ftc.teamcode.v1.util.geometry.rotaion;

//TODO: implement
public class Rotation2D {
    public Rotation2D (double degVal, RotationType dir) {
        this.degVal = degVal;
        this.dir = dir;
    }

    public RotationType getDir() {
        return dir;
    }

    public double getDegVal() {
        return degVal;
    }

    public void setDegVal(double degVal) {
        this.degVal = degVal;
    }

    RotationType dir;
    double degVal;
}
