package day19_LoopsAndString;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String grade = "";

        while (true) {
            System.out.println("Enter your score:");
            double score = scan.nextDouble();

            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry");
                System.exit(0);
            } else if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println(grade);

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            } else if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
    }

}

/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */