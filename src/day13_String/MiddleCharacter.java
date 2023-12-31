package day13_String;

import java.util.Scanner;

public class MiddleCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three letter word:");
        String word = scan.next();
        scan.close();

        int length = word.length();
        String result = "";

        if (length < 3) {
            result = "Word is too short";
        } else if (length > 3) {
            result = "Word is too long";
        } else {
            if (word.charAt(1) == 'a' || word.charAt(1) == 'A') {
                result = "Cool word";
            } else {
                result = "Okay word";
            }
        }

        System.out.println(result);

    }
}

/*

6. write a program that asks the user enter a three letters word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letters word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */