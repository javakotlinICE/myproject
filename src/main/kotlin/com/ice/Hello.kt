package com.ice

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human(weight = 63.8f, height = 1.8f)
    println(h.bmi())
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