package org.firstinspires.ftc.teamcode.v1.physicalPoints.dynamicPoints.linearPoints;

import org.firstinspires.ftc.teamcode.v1.physicalPoints.DynamicPoint;
import org.firstinspires.ftc.teamcode.v1.physicalPoints.PhysicalPoint;
import org.firstinspires.ftc.teamcode.v1.util.geometry.rotaion.Rotation3D;

import java.util.function.DoubleSupplier;

public class LinearSlidePoint extends DynamicPoint {
    LinearSlidePoint(PhysicalPoint point, DoubleSupplier lengthSupplier, Rotation3D rot);
}
