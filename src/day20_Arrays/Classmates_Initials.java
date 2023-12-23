package day20_Arrays;

public class Classmates_Initials {

    public static void main(String[] args) {

        String[] classmates = {"Ali Can", "Veli Dem", "Hasan Man", "George Tan"};

        for (int i = 0; i < classmates.length; i++) {
            String eachPerson = classmates[i];

            String initials = eachPerson.charAt(0) + "." + eachPerson.charAt(eachPerson.indexOf(" ") + 1) + ".";

            System.out.println(initials);
        }


    }
}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */