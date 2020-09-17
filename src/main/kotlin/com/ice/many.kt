package com.ice

fun main() {
    val list = listOf(5,1,7,2)
    println(list)
    val scores = listOf(68, 70, 80, 50,90)
    for (score in scores){
        println(score)
    }
    println(list.get(2))
    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)
}