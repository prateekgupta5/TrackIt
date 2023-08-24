package org.firstinspires.ftc.teamcode.v1.physicalPoints.physicalPoints;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.VectorHXYZ;

public abstract class PhysicalPoint {
    public abstract VectorHXYZ calculate () ;

    public abstract PointHXYZ getCurrentPoint () ;

    public abstract VectorHXYZ getCurrentPointAsVec () ;

    /** //TODO: finish
     * @param other
     * @return (other - this) for {x, y, z, hHoriz, hVert}
     */
    public double[] getPanTo (PointHXYZ other) {
        PointHXYZ thisPt = getCurrentPoint();

        return new double[] {
                (other.x - thisPt.x),
                (other.y - thisPt.y),
                (other.z - thisPt.z),
                (other.headingHoriz - thisPt.headingHoriz),
                (other.HeadingVert - thisPt.HeadingVert)
        };
    }

    /**
     *
     * @param other
     * @return (other - this) for {dist, vector rotation x, vector rotation y, end pt heading x, end pt heading y}
     */
    public double[] getRotationAndApproachTo (PointHXYZ other) {
        VectorHXYZ thisVec = getCurrentPointAsVec();
        VectorHXYZ vecToOther = new VectorHXYZ(getCurrentPointAsVec().getTail(), other);

        return new double[] {
                (vecToOther.length - thisVec.length),
                (vecToOther.rotHoriz - thisVec.rotHoriz),
                (vecToOther.rotVert - thisVec.rotVert),
                (vecToOther.hHoriz - thisVec.hHoriz),
                (vecToOther.hVert - thisVec.hVert)
        };
    }
}
