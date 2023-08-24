package org.firstinspires.ftc.teamcode.v2.GOAL.GOAL1;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.v2.util.math.point.Point3D;
import org.firstinspires.ftc.teamcode.v2.util.math.vector.Vector2D;

@TeleOp(name = "1", group = "goal")
public class GoalOpMode extends LinearOpMode {
    MyRobot myRobot;
    double POWER_SCALE_FACTOR;

    @Override
    public void runOpMode() throws InterruptedException {
        //init
        myRobot = new MyRobot(hardwareMap);

        while (opModeInInit()) {
            //init_loop
        }

        waitForStart();

        while (opModeIsActive()) {
            //loop
            if (gamepad1.a) {
                double distTo = myRobot.arm.getCurrentPoint().distTo(myRobot.offsetPoint(new Point3D(x,y,z))); //new point should be about 10 cm (100 mm) less than the other stuff
                myRobot.armLeft.setPower(distTo * POWER_SCALE_FACTOR);
                myRobot.armRight.setPower(distTo * POWER_SCALE_FACTOR);
            } else if (gamepad1.x) {
                double distTo = myRobot.arm.getCurrentPoint().distTo(myRobot.offsetPoint(new Point3D(x,y,z)));
                distTo -= Math.signum(distTo) * 100; //power is 0 within 10 cm of thing so bot no break from overturn
                myRobot.armLeft.setPower(distTo * POWER_SCALE_FACTOR);
                myRobot.armRight.setPower(distTo * POWER_SCALE_FACTOR);
            } else {
                myRobot.armLeft.setPower(0);
                myRobot.armRight.setPower(0);
            }

            if (gamepad1.start) {
                requestOpModeStop();
            }
        }

        //stop
    }
}
