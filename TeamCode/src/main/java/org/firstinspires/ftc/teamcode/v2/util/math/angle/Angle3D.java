package org.firstinspires.ftc.teamcode.v2.util.math.angle;

/**
 * represents an angle in 3D (an angle for rotation, and an angle for elevation)
 */
public class Angle3D {
    public Angle3D(double horizontal, double vertical, AngleUnit unit) {
        this.horizontal = new Angle2D(horizontal, unit);
        this.vertical = new Angle2D(vertical, unit);
    }

    public Angle3D(Angle2D horizontal, Angle2D vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public Angle2D[] to2D () {
        return new Angle2D[] {
                horizontal,
                vertical
        };
    }

    public Angle2D getHorizontal() {
        return horizontal;
    }

    public Angle2D getVertical() {
        return vertical;
    }

    Angle2D horizontal;
    Angle2D vertical;
}
