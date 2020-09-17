package com.ice.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun highestTest () {
        val student = Student ("ice", 60, 80)
        Assertions.assertEquals(80, student.highest())
    }
    @Test
    fun averageTest () {
        val student = Student ("ice", 60, 80)
        Assertions.assertEquals((60+80)/2, student.gatAverage())
    }
    @Test
    fun gradingTest () {
        val student = Student ("ice", 60, 80)
        Assertions.assertEquals('C', student.grading())
    }
    @Test
    fun passOrFailed () {
        val student = Student("ice", 60, 80)
        Assertions.assertEquals("PASS", student.passOrFailed())
    }
   /* @Test
    fun printTest () {
        val student = Student("ice", 60, 80)
        Assertions.assertEquals("ice,60,80,70,PASS,C", student.print())
    }*/
}