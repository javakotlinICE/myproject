package com.ice.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("ice", 87, 69)
    val stu1 = Student("ice", 60, 40)
    val stu2 = Student("ice", 33, 34)
    stu.print()
    stu1.print()
    stu2.print()
    println("High score: ${stu.highest()}")
}
class Student (var name: String?, var english: Int, var math: Int){
    companion object{
        @JvmStatic
        var pass = 60
        fun test() {
            println("Testing")
        }
    }
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
    fun passOrFailed() = if (gatAverage() >= pass) "PASS" else "FAILED"
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


