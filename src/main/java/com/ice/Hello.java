package com.ice;

public class Hello {
    public static void main (String[] args){
//        System.out.println("Hello world");
        Person p = new Person("ice", 63.6f, 1.8f);
        p.Hello();
        System.out.println(p.bmi());
        /*int age = 27;
        Integer age2 = 27;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 63.3f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "ice";*/
    }
}
