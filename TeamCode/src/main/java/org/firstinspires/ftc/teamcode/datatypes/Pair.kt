package org.firstinspires.ftc.teamcode.datatypes

import kotlin.math.*

data class Pair(var x: Double, var y: Double) {
    public fun distance(pair: Pair): Double {
        return sqrt((this.x - pair.x).pow(2) + (this.y - pair.y).pow(2))
    }

    operator fun plus(pair: Pair): Pair {
        return Pair(this.x + pair.x, this.y + pair.y)
    }
}