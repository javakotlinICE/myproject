package com.ice

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.ceil

fun main() {
    val enter = LocalDateTime.of(2020, 11, 4, 16, 0, 0)
    val lease = LocalDateTime.of(2020, 11, 4, 18, 0, 0)
    var car = Car("AAA-0001", enter)
    car.leave = lease
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}
class Car (val id : String, val enter : LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = value
        }
    fun duration() = Duration.between(enter, leave).toMinutes()
}
