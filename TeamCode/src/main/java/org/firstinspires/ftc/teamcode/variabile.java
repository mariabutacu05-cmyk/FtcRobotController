package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class variabile extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        int motorAngle = 46;
        String name = "Strix Novus";
        telemetry.addData("team Number", teamNumber);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("name", name);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
