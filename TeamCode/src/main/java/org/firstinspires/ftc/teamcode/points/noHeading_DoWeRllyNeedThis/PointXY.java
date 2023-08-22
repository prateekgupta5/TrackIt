package org.firstinspires.ftc.teamcode.points.noHeading_DoWeRllyNeedThis;

public class PointXY {
    public PointXY (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointXY (PointXY other) {
        x = other.x;
        y = other.y;
    }

    public PointXY (PointXY other, double offX, double offY) {
        x = other.x + offX;
        y = other.y + offY;
    }

    public double distTo (PointXY other) {
        return Math.sqrt( Math.pow((this.x - other.x), 2) +  Math.pow((this.y - other.y), 2) );
    }

    protected double x;
    protected double y;
}