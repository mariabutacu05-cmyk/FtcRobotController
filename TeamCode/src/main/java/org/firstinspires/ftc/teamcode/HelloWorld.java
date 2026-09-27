package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@Autonomous
public class HelloWorld extends OpMode {
    @Override
    public int hashCode() {
       telemetry.addData("Hello", "Your name");
    }

    @Override
    public void loop() {

    }

}
