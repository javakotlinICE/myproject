package com.ice.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("ice", 88, 10);
        stu.print();
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

    }
}
