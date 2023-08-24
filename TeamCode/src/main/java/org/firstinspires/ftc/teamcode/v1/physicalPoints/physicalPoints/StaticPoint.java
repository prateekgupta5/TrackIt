package org.firstinspires.ftc.teamcode.v1.physicalPoints.physicalPoints;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.VectorHXYZ;

public class StaticPoint extends PhysicalPoint {
    public StaticPoint(PointHXYZ point) {
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
