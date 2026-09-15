package org.firstinspires.ftc.teamcode.tools

import com.qualcomm.hardware.limelightvision.*
import com.qualcomm.robotcore.hardware.HardwareMap
import org.firstinspires.ftc.robotcore.external.navigation.Pose3D

import org.firstinspires.ftc.teamcode.datatypes.Pair

import kotlin.math.*

class LimeLight(hardwareMap: HardwareMap, pipeline: Int = 0) {
    val limelight: Limelight3A = hardwareMap.get(Limelight3A::class.java, "limelight")

    init {
        limelight.pipelineSwitch(pipeline)
        limelight.start()
    }

    fun latestResult(): LLResult? = limelight.latestResult
    fun stop() = limelight.stop()

    fun getTagID(): Int? {
        val result = latestResult() ?: return null
        if (!result.isValid) return null

        val fiducials = result.fiducialResults
        if (fiducials.isEmpty()) return null

        return fiducials.last().fiducialId
    }

    fun getPosition(): Pose3D? {
        val result = latestResult() ?: return null
        if (!result.isValid) return null
        return result.botpose
    }

    companion object {
        fun getDistance(a1: Double, a2: Double, h1: Double, h2: Double): Double {
            val angToGoal = a1 + a2
            val angleRadians = angToGoal * (PI / 180.0)
            return (h2 - h1) / tan(angleRadians)
        }
    }
}