package org.firstinspires.ftc.teamcode.v2.physicalPoints;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.VectorHXYZ;
import org.firstinspires.ftc.teamcode.v2.util.math.translation.Translation3D;
import org.firstinspires.ftc.teamcode.v2.util.math.vector.Vector3D;
import org.firstinspires.ftc.teamcode.v2.util.positionData.PositionData2D;
import org.firstinspires.ftc.teamcode.v2.util.positionData.PositionData3D;

public abstract class PhysicalPoint {
    public abstract Translation3D calculate () ;

    public abstract PositionData3D getCurrentPoint () ;

    public abstract Translation3D getCurrentPointAsTrans () ;

    /** //TODO: finish
     * @param other
     * @return (other - this) for {x, y, z, hHoriz, hVert}
     */
    public double[] getPanTo (PointHXYZ other) {
        PositionData3D thisPt = getCurrentPoint();

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
        Translation3D thisTrans = getCurrentPointAsTrans();
        Vector3D
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
