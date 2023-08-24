package org.firstinspires.ftc.teamcode.v1.physicalPoints.physicalPoints;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.VectorHXYZ;

public class StaticOffsetPoint extends PhysicalPoint {

    /**
     *
     * @param originPoint
     * @param offset
     */
    public StaticOffsetPoint (PhysicalPoint originPoint, VectorHXYZ offset) {
        this.originPoint = originPoint;
        this.offset = offset;
    }

    @Override
    public VectorHXYZ calculate() {
        currentPos = new VectorHXYZ(originPoint.getCurrentPoint(), offset);
        return currentPos;
    }

    @Override
    public PointHXYZ getCurrentPoint() {
        return currentPos.getAsPoint();
    }

    @Override
    public VectorHXYZ getCurrentPointAsVec() {
        return currentPos;
    }

    PhysicalPoint originPoint;
    VectorHXYZ currentPos;
    VectorHXYZ offset;
}
