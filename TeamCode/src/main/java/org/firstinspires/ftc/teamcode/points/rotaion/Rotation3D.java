package org.firstinspires.ftc.teamcode.points.rotaion;

//TODO: implement
public class Rotation3D {
    public Rotation3D (double degHoriz, double degVert) {
        this.degHoriz = degHoriz;
        this.degVert = degVert;
    }

    public double getDegHoriz () {
        return degHoriz;
    }

    public void setDegHoriz(double degHoriz) {
        this.degHoriz = degHoriz;
    }

    public double getDegVert() {
        return degVert;
    }

    public void setDegVert(double degVert) {
        this.degVert = degVert;
    }

    double degHoriz;
    double degVert;
}
