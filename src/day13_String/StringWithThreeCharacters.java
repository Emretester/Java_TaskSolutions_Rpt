package day13_String;

import java.util.Scanner;

public class StringWithThreeCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();
        scan.close();

        if (str.isEmpty()) {
            System.out.println("string is empty");
        } else if (str.length() > 3) {
            System.out.println(str.substring(str.length() - 3));
        } else {
            System.out.println(str);
        }

    }
}

/*

5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */