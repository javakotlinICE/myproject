package com.ice

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
//    write()
}

private fun write() {
    //    File("output.txt").writeText("abc123")
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")
    }
}