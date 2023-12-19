package day18_NestedLoop;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number:");
            int num1 = scan.nextInt();

            System.out.println("Enter a math operator:");
            char operator = scan.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid operator, please re-enter:");
                operator = scan.next().charAt(0);
            }

            System.out.println("Enter second number:");
            int num2 = scan.nextInt();

            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else {
                while (num2 == 0) {
                    System.out.println("Divider can not be zero, please re-enter second number:");
                    num2 = scan.nextInt();
                }
                result = num1 / num2;
            }

            System.out.println("result = " + result);

            System.out.println("Do you want to continue?:");

            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer, please re-enter:");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Thanks for using my calculator :) ");
                break;
            }

        }
    }


}

/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */