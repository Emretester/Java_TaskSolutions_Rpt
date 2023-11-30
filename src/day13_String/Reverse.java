package day13_String;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a five character string: ");
        String str = scan.next();
        scan.close();
        String result = "";

        if (str.length() < 5) {
            result = "Too short";
        } else if (str.length() > 5) {
            result = "Too long";
        } else {
            result += str.charAt(4);
            result += str.charAt(3);
            result += str.charAt(2);
            result += str.charAt(1);
            result += str.charAt(0);
        }

        System.out.println(result);
    }
}

/*

1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */