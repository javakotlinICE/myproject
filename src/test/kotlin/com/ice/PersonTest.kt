package com.ice.kotlin

import com.ice.Human
import com.ice.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest(){
        val human = Human("ice", 63.3f, 1.8f)
        Assertions.assertEquals(63.3f/(1.8f*1.8f), human.bmi())
    }
    @Test
    fun personBmiTest(){
        val personTest = Person(63.3f, 1.8f)
        Assertions.assertEquals(63.3f/(1.8f*1.8f), personTest.bmi())
    }
}