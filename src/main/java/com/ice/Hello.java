package com.ice;



public class Hello {
    public static void main (String[] args){

//        System.out.println("Hello world");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));
        Person p = new Person("ice", 63.6f, 1.8f);
        p.Hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80  || score > 90);
        char c = 'A';
        System.out.println(c > 'a');
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
