package day08_SingleIf;

public class MaxNumber {

    public static void main(String[] args) {

        int n1 = 300;
        int n2 = 300;

        if (n1 > n2) {
            System.out.println(n1 + " is maximum number");
        }

        if (n2 > n1) {
            System.out.println(n2 + " is maximum number");
        }

        if (n1 == n2) {
            System.out.println("Equal");
        }
    }
}

/*

3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

 */