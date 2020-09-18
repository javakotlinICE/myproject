package com.ice

import com.ice.kotlin.Student

fun main() {
    val student = Student ("ice", 60, 60)

    var s:String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h = Human(weight = 63.8f, height = 1.8f)
    println(h.bmi())
    val score = 88
    println(score > 80)
    val c : Char = 'A'
    println(c.toInt() > 60)
    /*var age = 19
    age = 20
    var weight  = 66.3
    var name : String
    name = "ice"*/
}

class Human(var name: String = "", var weight : Float, var height : Float) {
    init {
        println("test $weight")
    }
//    constructor(name : String, weight : Float, height :Float) : this(weight, height)
    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello(){
        println("Hello kotlin")
    }
    }