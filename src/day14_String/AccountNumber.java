package day14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number:");
        String accountNumber = scan.next();

        char firstChar = accountNumber.charAt(0);
        int length = accountNumber.length();
        String result = "Invalid account number";

        if (firstChar == '2' && length == 7 || firstChar == '5' && length == 10) {
            result = "Valid account number";
        }

        System.out.println(result);

    }
}

/*

6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”

 */