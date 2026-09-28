package org.firstinspires.ftc.teamcode.teleOp

import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.Servo

@TeleOp(name = "AdjustableHood")
class AdjustableHood : OpMode(){
    private lateinit var hood : Servo
    override fun init() {
        hood = hardwareMap.get(Servo::class.java, "hood")
    }

    override fun loop() {
        when{
            gamepad1.right_bumper -> hood.position += 0.1
            gamepad1.left_bumper -> hood.position -= 0.1

        }
    }
}