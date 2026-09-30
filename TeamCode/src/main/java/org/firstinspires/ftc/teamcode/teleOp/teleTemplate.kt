package org.firstinspires.ftc.teamcode.teleOp

import com.pedropathing.follower.Follower
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

import com.pedropathing.drivetrain.DrivePowers
import com.pedropathing.follower.ManualDrive

import org.firstinspires.ftc.teamcode.pedro.Constants

@TeleOp(name = "teleOp Template")
class teleTemplate : OpMode() {

    private lateinit var follower: Follower

    override fun init() {
        follower = Constants.create(hardwareMap)
    }

    override fun loop() {
        follower.update()
    }
}