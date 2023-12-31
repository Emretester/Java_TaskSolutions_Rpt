package day10_NestedIf_Ternaries;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 67;
        String result = "";

        if (age >= 0 || age <= 150) {
            if (age < 21) {
                result = "Teenager";
            } else if (age < 55) {
                result = "Adult";
            } else {
                result = "Senior";
            }
        } else {
            result = "Invalid";
        }

        System.out.println(result);

    }
}

/*

4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */