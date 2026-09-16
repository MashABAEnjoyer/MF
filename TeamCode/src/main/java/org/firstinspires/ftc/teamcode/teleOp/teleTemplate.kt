package org.firstinspires.ftc.teamcode.teleOp

import com.pedropathing.follower.Follower
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

import org.firstinspires.ftc.teamcode.pedro.Constants

@TeleOp(name = "teleOp Template")
class teleTemplate : OpMode() {

    private lateinit var follower: Follower

    override fun init() {
        follower = Constants.create(hardwareMap)
    }

    override fun loop() {
        follower.manual(
            (-gamepad1.left_stick_y).toDouble(),
            gamepad1.right_stick_x.toDouble(),
            gamepad1.right_stick_x.toDouble()
        )

        follower.update()
    }
}