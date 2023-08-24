package org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading;

import org.firstinspires.ftc.teamcode.v1.util.geometry.rotaion.RotationType;

public class VectorHXYZ {
    public VectorHXYZ (PointHXYZ tail, VectorHXYZ vec) ;

    public VectorHXYZ (PointHXYZ tail, double length, double rotationXZ, double rotationYZ) ;

    public VectorHXYZ (VectorHXY vec) ;

    public VectorHXYZ (VectorHXY vec, double rotationVertDeg) ;

    public VectorHXYZ (VectorHXY vec, RotationType plain) ;

    public VectorHXYZ (VectorHXY vec, RotationType plain, double otherRotationDeg) ;

    public VectorHXYZ (PointHXYZ tail, PointHXYZ tip) ;

    public VectorHXYZ (RelativeDirection dir, double length) ;

    public PointHXYZ getAsPoint () ;

    public PointHXYZ getTail() ;

    public double getLength() {
        return length;
    }

    public double length ,hHoriz, hVert, rotHoriz, rotVert;
}
