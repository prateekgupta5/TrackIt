package org.firstinspires.ftc.teamcode.v2.util.math.angle;

/**
 * represents an angle in 2D
 */
public class Angle2D {
    public Angle2D (double angle, AngleUnit unit) {
        if (unit == AngleUnit.DEGREES) {
            this.angleDeg = angle;
            this.angleRad = Math.toRadians(angle);
        } else {
            this.angleDeg = Math.toDegrees(angle);
            this.angleRad = angle;
        }
    }

    public Angle2D (double angle) ; //deg

    public Angle2D (double num, double denom) ; //rad

    public double getAngleDeg () {
        return angleDeg;
    }

    public double getAngleRad () {
        return angleRad;
    }

    double angleDeg;
    double angleRad;
}
