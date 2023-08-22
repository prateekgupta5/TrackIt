package org.firstinspires.ftc.teamcode.points.rotaion;

import java.util.function.DoubleSupplier;

public class Rotation3DSupplier {
    public Rotation3DSupplier (DoubleSupplier degHorizSupplier, DoubleSupplier degVertSupplier) {
        this.degHorizSupplier = degHorizSupplier;
        this.degVertSupplier = degVertSupplier;
    }

    public double getDegHoriz() {
        return degHorizSupplier.getAsDouble();
    }

    public double getDegVert() {
        return degVertSupplier.getAsDouble();
    }


    DoubleSupplier degHorizSupplier;
    DoubleSupplier degVertSupplier;
}
