package day17_While_DoWhileLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /* This is my solution:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);
        int result;

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.println("Invalid operator. Please re-enter:");
            operator = scan.next().charAt(0);
        }

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else {
            while (num2 == 0) {
                System.out.println("Divider can't be zero, please enter a different number:");
                num2 = scan.nextInt();
            }
            result = num1 / num2;
        }

        System.out.println("result = " + result);

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("Enter your math operator");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.err.println("Invalid Operator, please re-enter:");
            ch = scan.next().charAt(0);
        }

        double result = 0;

        if (ch == '-') {
            result = num1 - num2;
        } else if (ch == '+') {
            result = num1 + num2;
        } else if (ch == '*') {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }

        System.out.println(result);
        scan.close();

    }
}

/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */