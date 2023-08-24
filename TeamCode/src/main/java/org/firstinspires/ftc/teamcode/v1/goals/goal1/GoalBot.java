package org.firstinspires.ftc.teamcode.v1.goals.goal1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.v1.localisers.AprilTagsLocaliser;
import org.firstinspires.ftc.teamcode.v1.localisers.CompositeLocaliser;
import org.firstinspires.ftc.teamcode.v1.localisers.Localiser;
import org.firstinspires.ftc.teamcode.v1.localisers.OdoLocaliser;
import org.firstinspires.ftc.teamcode.v1.physicalPoints.StaticPoint;
import org.firstinspires.ftc.teamcode.v1.physicalPoints.dynamicPoints.linearPoints.LinearSlidePoint;
import org.firstinspires.ftc.teamcode.v1.ui.PointBot;
import org.firstinspires.ftc.teamcode.v1.util.constants.StartingPoints;
import org.firstinspires.ftc.teamcode.v1.util.geometry.points.withHeading.PointHXYZ;

public class GoalBot extends PointBot {
    public GoalBot(HardwareMap hMap) {
        super(StartingPoints.RED_LEFT, new CompositeLocaliser( new Localiser[]{
                new AprilTagsLocaliser(),
                new OdoLocaliser()
        }));

        leftArm = hMap.dcMotor.get(LEFT_NAME);
        rightArm = hMap.dcMotor.get(RIGHT_NAME);

        topOfSlide = new LinearSlidePoint(
                new StaticPoint(offsetPoint(ARM_PIVOT_POINT)),
                () -> ((rightArm.getCurrentPosition() - leftArm.getCurrentPosition())/ TICKS_PER_REVOLUTION),

        );
    }

    DcMotor leftArm, rightArm;
    LinearSlidePoint topOfSlide;

    //TODO: replace each instance of these with their proper value
    String LEFT_NAME, RIGHT_NAME;
    PointHXYZ ARM_PIVOT_POINT;
    double TICKS_PER_REVOLUTION;
}
