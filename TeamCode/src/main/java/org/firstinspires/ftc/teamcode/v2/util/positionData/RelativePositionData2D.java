package org.firstinspires.ftc.teamcode.v2.util.positionData;

import org.firstinspires.ftc.teamcode.v2.util.math.heading.Heading2D;

public class RelativePositionData2D {
    public RelativePositionData2D(Heading2D origin, Heading2D position) {
        this.origin = origin;
        this.position = position;
    }

    public Heading2D origin;
    public Heading2D position;
}