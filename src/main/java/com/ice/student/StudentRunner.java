package com.ice.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();

        Student.pass = 50;
        Student stu = new Student("ice", 90, 10);
        Student stu1 = new Student("icC", 20, 60);
        Student stu2 = new Student("CCC", 90, 80);
        GraduateStudent gstu = new GraduateStudent("AAA", 60, 60, 60);
        gstu.print();
        stu.print();
        stu1.print();
        stu2.print();
        System.out.println("High score: " + stu.highest());

    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
