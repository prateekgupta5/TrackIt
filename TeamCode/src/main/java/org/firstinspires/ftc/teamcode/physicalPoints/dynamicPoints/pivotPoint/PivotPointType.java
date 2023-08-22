package org.firstinspires.ftc.teamcode.physicalPoints.dynamicPoints.pivotPoint;

public enum PivotPointType {
    FIXED_LENGTH_2D,
    FIXED_LENGTH_3D,
    DYNAMIC_LENGTH_2D,
    DYNAMIC_LENGTH_3D;

    public boolean is2D () {
        return (this.equals(FIXED_LENGTH_2D) || this.equals(DYNAMIC_LENGTH_2D));
    }

    public boolean is3D () {
        return (this.equals(FIXED_LENGTH_3D) || this.equals(DYNAMIC_LENGTH_3D));
    }

    public boolean isStaticLength () {
        return (this.equals(FIXED_LENGTH_2D) || this.equals(FIXED_LENGTH_3D));
    }

    public boolean isDynamicLength () {
        return (this.equals(DYNAMIC_LENGTH_2D) || this.equals(DYNAMIC_LENGTH_3D));
    }
}
