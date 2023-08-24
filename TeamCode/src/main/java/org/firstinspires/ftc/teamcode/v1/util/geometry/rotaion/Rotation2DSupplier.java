package org.firstinspires.ftc.teamcode.v1.util.geometry.rotaion;

import java.util.function.DoubleSupplier;

public class Rotation2DSupplier {
    public Rotation2DSupplier (DoubleSupplier degValSupplier, RotationType dir) {
        this.degValSupplier = degValSupplier;
        this.dir = dir;
    }

    public RotationType getDir() {
        return dir;
    }

    public double getDegVal() {
        return degValSupplier.getAsDouble();
    }

    RotationType dir;
    DoubleSupplier degValSupplier;
}
