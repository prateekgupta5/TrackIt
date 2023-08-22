package org.firstinspires.ftc.teamcode.points.withHeading;

import org.firstinspires.ftc.teamcode.points.rotaion.RotationType;

public class VectorHXYZ {
    public VectorHXYZ (PointHXYZ tail, VectorHXYZ vec) {}

    public VectorHXYZ (PointHXYZ tail, double length, double rotationXZ, double rotationYZ) {}

    public VectorHXYZ (VectorHXY vec) {}

    public VectorHXYZ (VectorHXY vec, double rotationVertDeg) {}

    public VectorHXYZ (VectorHXY vec, RotationType plain) {}

    public VectorHXYZ (VectorHXY vec, RotationType plain, double otherRotationDeg) {}

    public PointHXYZ getAsPoint () {}
}
