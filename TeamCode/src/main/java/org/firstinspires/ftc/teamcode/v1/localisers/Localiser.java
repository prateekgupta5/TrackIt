package org.firstinspires.ftc.teamcode.v1.localisers;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;

public abstract class Localiser {
    protected Localiser (String name, LocalizerType type) {
        this.name = name;
        this.type = type;
    }

    public abstract PointHXYZ getPoint() ;

    public String getName() {
        return name;
    }

    public LocalizerType getType() {
        return type;
    }

    String name;
    final LocalizerType type;
}
