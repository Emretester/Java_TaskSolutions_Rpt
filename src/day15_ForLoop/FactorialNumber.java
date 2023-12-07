package day15_ForLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        scan.close();

        if (num<0){
            System.out.println("Invalid number");
        }else{
            int factorial =1;
            for (int i = num; i >0 ; i--) {
                factorial *=i;
            }

            System.out.println(factorial);
        }

    }
}

/*

4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */