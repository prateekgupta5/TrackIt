package org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading;

public class VectorHXY {
    public VectorHXY (double deg, double length) {
        tail = new PointHXY(0,0, 0);
        this.deg = deg;
        this.length = length;
    }

    public VectorHXY (VectorHXY other, PointHXY newTail) ;


    PointHXY tail;
    double deg;
    double length;
}
