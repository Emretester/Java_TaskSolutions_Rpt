package day08_SingleIf;

public class EligibleToBuyCigarettes {

    public static void main(String[] args) {

        byte age = 18;

        boolean isEligible = age >= 14;

        if (isEligible) {
            System.out.println("The person is eligible to buy cigarettes");
        }
        if (!isEligible) {
            System.out.println("The person is not eligible to buy cigarettes");
        }


    }
}

/*

	1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

 */