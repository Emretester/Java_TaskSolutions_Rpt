package day09_IfElse_MultiBranchIf;

public class Finra {

    public static void main(String[] args) {

        int num = 8;
        String text;

        if (num % 15 == 0) {
            text = "FINRA";
        } else if (num % 3 == 0) {
            text = "FIN";
        } else if (num % 5 == 0) {
            text = "RA";
        } else {
            text = "" + num;
        }

        System.out.println(text);
    }
}

/*

3. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA

 */