package itsStart;

import java.util.Scanner;

public class Kalkulator11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Select item");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("S - Exit");
            int item = scan.nextInt();
            if (item == 5) {
                break;
            } else if (item == 1) {
                System.out.println("Enter first number");
                int num1 = scan.nextInt();
                System.out.println("Enter second number");
                int num2 = scan.nextInt();
                System.out.println(num1 + num2);
            } else if (item == 2) {
                System.out.println("Enter first number");
                int num1 = scan.nextInt();
                System.out.println("Enter second number");
                int num2 = scan.nextInt();
                System.out.println(num1 - num2);
            } else if (item == 3) {
                System.out.println("Enter first number");
                int num1 = scan.nextInt();
                System.out.println("Enter second number");
                int num2 = scan.nextInt();
                System.out.println(num1 * num2);
            } else if (item == 4) {
                System.out.println("Enter first number");
                int num1 = scan.nextInt();
                System.out.println("Enter second number");
                int num2 = scan.nextInt();
                if (num2 == 0){
                    System.out.println("Error");
                    continue;
                }
                System.out.println(num1 / num2);
            }

        }
        System.out.println("Code finished");
    }
}