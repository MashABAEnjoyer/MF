package org.firstinspires.ftc.teamcode.control

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.HardwareMap

abstract class motor(
    hardwareMap: HardwareMap,
    name: String,
    direction: DcMotorSimple.Direction = DcMotorSimple.Direction.FORWARD
) {
    val motor: DcMotor = hardwareMap.get(DcMotor::class.java, name)
    val isBusy: Boolean
        get() = motor.isBusy

    init {
        motor.direction = direction
    }


    fun run(power: Double = 1.0) {
        motor.power = power
    }
}