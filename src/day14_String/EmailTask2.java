package day14_String;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = scan.next();
        scan.close();

        String firstName = email.substring(0, email.indexOf("_"));
        String firstOfFirst = firstName.substring(0, 1);
        String upperCaseOfFirst = firstOfFirst.toUpperCase();
        firstName = upperCaseOfFirst + firstName.substring(1);

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String firstOfLast = lastName.substring(0, 1);
        String upperCaseOfLast = firstOfLast.toUpperCase();
        lastName = upperCaseOfLast + lastName.substring(1);

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}

/*

8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */