package org.firstinspires.ftc.teamcode.auto

import com.pedropathing.follower.Follower
import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.OpMode

import org.firstinspires.ftc.teamcode.pedro.Constants

@Autonomous(name = "Auto Template")
class autoTemplate: OpMode() {

    private lateinit var follower: Follower

    override fun init() {
        follower = Constants.create(hardwareMap)
    }

    override fun start() {
        super.start()
    }

    override fun loop() {
        TODO("Not yet implemented")
    }
}