package org.firstinspires.ftc.teamcode.v1.ui;

import org.firstinspires.ftc.teamcode.v1.localisers.Localiser;
import org.firstinspires.ftc.teamcode.v1.physicalPoints.DynamicPoint;
import org.firstinspires.ftc.teamcode.v1.physicalPoints.PhysicalPoint;
import org.firstinspires.ftc.teamcode.v1.physicalPoints.StaticPoint;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.VectorHXYZ;

import java.util.ArrayList;

public class PointBot {
    public PointBot(PointHXYZ startingPoint, Localiser robotLocaliser) {
        ROBOTC_CENTER = new DynamicPoint(new StaticPoint(startingPoint), () -> new VectorHXYZ(startingPoint, this.robotLocaliser.getPoint()) );
        this.robotLocaliser = robotLocaliser;
        armSystems = new ArrayList<>();
        this.startingPoint = startingPoint;

    }

    public PointHXYZ offsetPoint (PointHXYZ point) {
        PointHXYZ currentPos = robotLocaliser.getPoint();

        return new PointHXYZ(
                (point.x + currentPos.x),
                (point.y + currentPos.y),
                (point.z + currentPos.z),
                (point.headingHoriz + currentPos.headingHoriz),
                (point.HeadingVert + currentPos.HeadingVert)
        );
    }

    final PointHXYZ startingPoint;
    protected ArrayList<PhysicalPoint[]> armSystems;
    protected final DynamicPoint ROBOTC_CENTER;
    protected Localiser robotLocaliser;
}
