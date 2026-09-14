package org.firstinspires.ftc.teamcode.tools

import com.qualcomm.hardware.limelightvision.*
import com.qualcomm.hardware.limelightvision.LLResultTypes.FiducialResult
import com.qualcomm.robotcore.hardware.ColorSensor
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.IMU

import org.firstinspires.ftc.robotcore.external.navigation.Pose3D
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles

import kotlin.math.*

class LimeLight(val limelight: Limelight3A) {
    fun getTagID(results: List<LLResultTypes.FiducialResult>): Int {
        var id = 0
        for (fiducial in results) {
            id = fiducial.fiducialId;
        }
        return id
    }

    fun getDistance(a1: Double, a2: Double, h1: Double, h2: Double): Double {
        val angToGoal = a1 + a2
        val angleRadians = angToGoal * (PI / 180.0)
        return (h2-h1) / tan(angleRadians)
    }

    fun getPosition(botPosition: Pose3D) {
    }
}