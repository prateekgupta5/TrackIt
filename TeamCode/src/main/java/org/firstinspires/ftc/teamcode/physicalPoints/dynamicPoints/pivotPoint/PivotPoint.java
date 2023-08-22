package org.firstinspires.ftc.teamcode.physicalPoints.dynamicPoints.pivotPoint;

import org.firstinspires.ftc.teamcode.physicalPoints.DynamicPoint;
import org.firstinspires.ftc.teamcode.physicalPoints.PhysicalPoint;
import org.firstinspires.ftc.teamcode.points.rotaion.Rotation2DSupplier;
import org.firstinspires.ftc.teamcode.points.rotaion.Rotation3DSupplier;
import org.firstinspires.ftc.teamcode.points.rotaion.RotationType;
import org.firstinspires.ftc.teamcode.points.withHeading.PointHXYZ;
import org.firstinspires.ftc.teamcode.points.withHeading.VectorHXY;
import org.firstinspires.ftc.teamcode.points.withHeading.VectorHXYZ;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

//TODO: add comments
//TODO: check if using the supplyer.get() straight away will ensure to update, or will always stay at the specified value
//TODO: create constructors for all other PivotPointTypes
public class PivotPoint extends DynamicPoint {

    //FIXED_LENGTH_2D --------------------------------------------------------------------------------------------------

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotSupplyer
     * @param length
     */
    protected PivotPoint (PhysicalPoint originationPoint, Rotation2DSupplier rotSupplyer, double length) {
        super(originationPoint,
                () -> new VectorHXYZ(new VectorHXY(rotSupplyer.getDegVal(), length), rotSupplyer.getDir())
        );

        type = PivotPointType.FIXED_LENGTH_2D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param degAngleSupplyer
     * @param dir
     * @param length
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier degAngleSupplyer, RotationType dir, double length) {
        super(originationPoint,
              () -> new VectorHXYZ(new VectorHXY(degAngleSupplyer.getAsDouble(), length), dir)
        );

        type = PivotPointType.FIXED_LENGTH_2D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotationSegmentSupplyer
     * @param numSegments
     * @param dir
     * @param length
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier rotationSegmentSupplyer,  double numSegments, RotationType dir, double length) {
        super(originationPoint,
              () -> new VectorHXYZ(new VectorHXY( (rotationSegmentSupplyer.getAsDouble()/numSegments), length), dir)
        );

        type = PivotPointType.FIXED_LENGTH_2D;
    }

    //DYNAMIC_LENGTH_2D ------------------------------------------------------------------------------------------------

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotSupplyer
     * @param lengthSupplier
     */
    protected PivotPoint (PhysicalPoint originationPoint, Rotation2DSupplier rotSupplyer, DoubleSupplier lengthSupplier) {
        super(originationPoint,
                () -> new VectorHXYZ(new VectorHXY(rotSupplyer.getDegVal(), lengthSupplier.getAsDouble()), rotSupplyer.getDir())
        );

        type = PivotPointType.DYNAMIC_LENGTH_2D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param degAngleSupplyer
     * @param dir
     * @param lengthSupplier
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier degAngleSupplyer, RotationType dir, DoubleSupplier lengthSupplier) {
        super(originationPoint,
              () -> new VectorHXYZ(new VectorHXY(degAngleSupplyer.getAsDouble(), lengthSupplier.getAsDouble()), dir)
        );

        type = PivotPointType.DYNAMIC_LENGTH_2D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotationSegmentSupplyer
     * @param numSegments
     * @param dir
     * @param lengthSupplier
     */
    protected PivotPoint (PhysicalPoint originationPoint, Supplier<Double> rotationSegmentSupplyer,  double numSegments, RotationType dir, DoubleSupplier lengthSupplier) {
        super(originationPoint,
              () -> new VectorHXYZ(new VectorHXY( (rotationSegmentSupplyer.get()/numSegments), lengthSupplier.getAsDouble()), dir)
        );

        type = PivotPointType.DYNAMIC_LENGTH_2D;
    }

    //FIXED_LENGTH_3D --------------------------------------------------------------------------------------------------

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotSupplyer
     * @param length
     */
    protected PivotPoint (PhysicalPoint originationPoint, Rotation3DSupplier rotSupplyer, double length) {
        super(originationPoint,
                () -> new VectorHXYZ(new PointHXYZ(0,0,0,0,0), length, rotSupplyer.getDegHoriz(), rotSupplyer.getDegVert())
        );

        type = PivotPointType.FIXED_LENGTH_3D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param degHorizAngleSupplyer
     * @param degVertAngleSupplyer
     * @param length
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier degHorizAngleSupplyer, DoubleSupplier degVertAngleSupplyer, double length) {
        super(originationPoint,
              () -> new VectorHXYZ(new PointHXYZ(0,0,0,0,0), length, degHorizAngleSupplyer.getAsDouble(), degVertAngleSupplyer.getAsDouble())
        );

        type = PivotPointType.FIXED_LENGTH_3D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotationSegmentSupplyerHoriz
     * @param numSegmentsHoriz
     * @param rotationSegmentSupplyerVert
     * @param numSegmentsVert
     * @param length
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier rotationSegmentSupplyerHoriz,  double numSegmentsHoriz, DoubleSupplier rotationSegmentSupplyerVert,  double numSegmentsVert, double length) {
        super(originationPoint,
              () -> new VectorHXYZ(new PointHXYZ(0,0,0,0,0), length, (rotationSegmentSupplyerHoriz.getAsDouble()/numSegmentsHoriz), (rotationSegmentSupplyerVert.getAsDouble()/numSegmentsVert))
        );

        type = PivotPointType.FIXED_LENGTH_3D;
    }

    //DYNAMIC_LENGTH_3D --------------------------------------------------------------------------------------------------

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotSupplyer
     * @param lengthSupplier
     */
    protected PivotPoint (PhysicalPoint originationPoint, Rotation3DSupplier rotSupplyer, DoubleSupplier lengthSupplier) {
        super(originationPoint,
                () -> new VectorHXYZ(new PointHXYZ(0,0,0,0,0), lengthSupplier.getAsDouble(), rotSupplyer.getDegHoriz(), rotSupplyer.getDegVert())
        );

        type = PivotPointType.FIXED_LENGTH_3D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param degHorizAngleSupplyer
     * @param degVertAngleSupplyer
     * @param lengthSupplier
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier degHorizAngleSupplyer, DoubleSupplier degVertAngleSupplyer, DoubleSupplier lengthSupplier) {
        super(originationPoint,
                () -> new VectorHXYZ(new PointHXYZ(0,0,0,0,0), lengthSupplier.getAsDouble(), degHorizAngleSupplyer.getAsDouble(), degVertAngleSupplyer.getAsDouble())
        );

        type = PivotPointType.DYNAMIC_LENGTH_3D;
    }

    /**
     *
     * @param originationPoint the root from which it pivots - type: PhysicalPoint
     * @param rotationSegmentSupplyerHoriz
     * @param numSegmentsHoriz
     * @param rotationSegmentSupplyerVert
     * @param numSegmentsVert
     * @param lengthSupplier
     */
    protected PivotPoint (PhysicalPoint originationPoint, DoubleSupplier rotationSegmentSupplyerHoriz,  double numSegmentsHoriz, DoubleSupplier rotationSegmentSupplyerVert,  double numSegmentsVert, DoubleSupplier lengthSupplier) {
        super(originationPoint,
                () -> new VectorHXYZ(new PointHXYZ(0,0,0,0,0), lengthSupplier.getAsDouble(), (rotationSegmentSupplyerHoriz.getAsDouble()/numSegmentsHoriz), (rotationSegmentSupplyerVert.getAsDouble()/numSegmentsVert))
        );

        type = PivotPointType.DYNAMIC_LENGTH_3D;
    }


    //feilds -----------------------------------------------------------------------------------------------------------
    PivotPointType type;

    public PivotPointType getType() {
        return type;
    }
}