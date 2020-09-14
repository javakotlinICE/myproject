package com.ice.kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("ice", 87, 69)
    stu.print()
    println("High score: ${stu.highest()}")
}
class Student (var name: String?, var english: Int, var math: Int){
    fun print(){
        println("$name\t$english\t$math\t${gatAverage()}\t${passOrFailed()}\t${grading()}")
    }
    fun grading() = when (gatAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    fun passOrFailed() = if (gatAverage() >= 60) "PASS" else "FAILED"
    fun gatAverage() = (english+math)/2

    fun highest() = if (english > math){
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck () = name?.length
}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
}


