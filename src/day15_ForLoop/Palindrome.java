package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.next();
        scan.close();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(str.equals(reversed));
    }

}

/*

8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true

				input:
					Anna

				output:
					true

 */