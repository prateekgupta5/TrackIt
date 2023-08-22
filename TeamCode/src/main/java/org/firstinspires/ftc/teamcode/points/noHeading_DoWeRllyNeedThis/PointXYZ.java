package org.firstinspires.ftc.teamcode.points.noHeading_DoWeRllyNeedThis;

public class PointXYZ {

    public PointXYZ (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public PointXYZ (PointXYZ other) {
        x = other.x;
        y = other.y;
        z = other.z;
    }

    public PointXYZ (PointXYZ other, double offX, double offY, double offZ) {
        x = other.x + offX;
        y = other.y + offY;
        z = other.z + offZ;
    }

    protected double x;
    protected double y;
    protected double z;
}
