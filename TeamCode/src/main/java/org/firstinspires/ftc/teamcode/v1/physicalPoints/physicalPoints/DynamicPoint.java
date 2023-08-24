package org.firstinspires.ftc.teamcode.v1.physicalPoints.physicalPoints;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.VectorHXYZ;

import java.util.function.Supplier;

public class DynamicPoint extends PhysicalPoint {
    public DynamicPoint(PhysicalPoint originationPoint, Supplier<VectorHXYZ> offsetCalc) {
        this.originationPoint = originationPoint;
        this.offsetCalc = offsetCalc;
    }

    @Override
    public PointHXYZ getCurrentPoint() {
        return currentPointDisc.getAsPoint();
    }

    @Override
    public VectorHXYZ getCurrentPointAsVec() {
        return currentPointDisc;
    }

    public VectorHXYZ calculate() {
        currentPointDisc = new VectorHXYZ(originationPoint.getCurrentPoint(), offsetCalc.get());
        return currentPointDisc;
    }

    Supplier<VectorHXYZ> offsetCalc;
    VectorHXYZ currentPointDisc;
    PhysicalPoint originationPoint;
}