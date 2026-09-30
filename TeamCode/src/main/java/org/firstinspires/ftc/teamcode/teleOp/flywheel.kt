package org.firstinspires.ftc.teamcode.teleOp

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.hardware.DcMotor

@TeleOp(name = "teleOp flywheel")
class flywheel : LinearOpMode(){
    private lateinit var flyWheel: DcMotor
    override fun runOpMode() {
        flyWheel = hardwareMap.get(DcMotor::class.java, "flywheel")
        if (gamepad1.circle) {
            flyWheel.power = 1.0
        }
    }
}
