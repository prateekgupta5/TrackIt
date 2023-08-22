package org.firstinspires.ftc.teamcode.physicalPoints;

import org.firstinspires.ftc.teamcode.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.points.withHeading.VectorHXYZ;

public class StaticPoint extends PhysicalPoint{
    protected StaticPoint(PointHXYZ point) {
        this.point = point;
    }

    @Override
    public VectorHXYZ calculate() {
        return new VectorHXYZ(point, 0, 0, 0);
    }

    @Override
    public PointHXYZ getCurrentPoint() {
        return point;
    }

    @Override
    public VectorHXYZ getCurrentPointAsVec() {
        return new VectorHXYZ(point, 0, 0, 0);
    }

    PointHXYZ point;
}
