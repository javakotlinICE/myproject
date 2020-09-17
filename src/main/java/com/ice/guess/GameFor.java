package com.ice.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum = 0;
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println(sum);*/
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number(" + i + "/5): ");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次" + number);
            if (number > secret){
                System.out.println("Lower");
            }else if (number < secret){
                System.out.println("higher");
            }else{
                System.out.println("Great, the number is: " + number);
                break;
            }
        }
        System.out.println("結束");
    }
}
