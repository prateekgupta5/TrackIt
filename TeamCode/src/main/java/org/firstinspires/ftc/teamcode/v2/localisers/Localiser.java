package org.firstinspires.ftc.teamcode.v2.localisers;

import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v2.util.positionData.PositionData2D;
import org.firstinspires.ftc.teamcode.v2.util.positionData.PositionData3D;

public abstract class Localiser {
    protected Localiser (String name, LocalizerType type) {
        this.name = name;
        this.type = type;
    }

    public abstract PositionData2D getRobotPosition () ;

    public abstract PositionData3D getRobotPositionOffset () ;

    public String getName () {
        return name;
    }

    public LocalizerType getType () {
        return type;
    }

    String name;
    final LocalizerType type;
}
