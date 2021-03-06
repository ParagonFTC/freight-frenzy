package org.firstinspires.ftc.teamcode.opmodes.testing;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DigitalChannel;

@Disabled
@TeleOp
public class BreakBeamTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DigitalChannel breakBeam = hardwareMap.get(DigitalChannel.class, "breakBeam");
        breakBeam.setMode(DigitalChannel.Mode.INPUT);
        waitForStart();
        while (!isStopRequested()) {
            telemetry.addData("Break Beam", breakBeam.getState());
            telemetry.update();
        }
    }
}
