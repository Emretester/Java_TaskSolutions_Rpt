package day14_String;

import java.util.Scanner;

public class EndsWithLY {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();

        if (word.charAt(word.length() - 2) == 'l' && word.charAt(word.length() - 1) == 'y') {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }

        System.out.println("-----------------------------------");


        if (word.substring(word.length() - 2).equals("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }


    }
}

/*

        2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */