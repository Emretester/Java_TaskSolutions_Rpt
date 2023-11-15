package day10_NestedIf_Ternaries;

public class Grade {

    public static void main(String[] args) {

        char grade = 'F';
        String result = "";

        if (grade >= 'A' && grade <= 'D' || grade == 'F') {
            if (grade == 'A') {
                result = "excellent";
            } else if (grade == 'B') {
                result = "great job";
            } else if (grade == 'C') {
                result = "good";
            } else if (grade == 'D') {
                result = "passed";
            } else {
                result = "failed";
            }

        } else {
            result = "invalid";
        }
        System.out.println(grade);
        System.out.println(result);
    }
}

/*

3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */