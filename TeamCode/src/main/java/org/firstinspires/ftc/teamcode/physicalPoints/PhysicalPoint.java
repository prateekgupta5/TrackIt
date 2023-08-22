package org.firstinspires.ftc.teamcode.physicalPoints;

import org.firstinspires.ftc.teamcode.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.points.withHeading.VectorHXYZ;

public abstract class PhysicalPoint {
    public abstract VectorHXYZ calculate () ;

    public abstract PointHXYZ getCurrentPoint () ;

    public abstract VectorHXYZ getCurrentPointAsVec () ;
}
