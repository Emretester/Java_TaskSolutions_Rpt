package day14_String;

import java.util.Scanner;

public class AddTwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();

        char lastCharOfWord1 = word1.toLowerCase().charAt(word1.length() - 1);
        char firstCharOfWord2 = word2.toLowerCase().charAt(0);

        if (lastCharOfWord1 == firstCharOfWord2) {
            word1 = word1.substring(0, word1.length() - 1);
        }

        System.out.println(word1 + word2);

    }
}

/*

 4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */