package day13_String;

import java.util.Scanner;

public class FirstLastCharSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}

/*

3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */