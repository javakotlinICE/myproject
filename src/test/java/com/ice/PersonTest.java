package com.ice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest() {
        Person person = new Person(63.3f,1.8f);
        Assertions.assertEquals(63.3f/(1.8f*1.8f),person.bmi());
    }
}
