package day08_SingleIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 16;

        if (gradeLevel <= 5) {
            System.out.println("Elementary School");
        }

        if (gradeLevel <= 8 && gradeLevel > 5) {
            System.out.println("Middle school");
        }

        if (gradeLevel <= 12 && gradeLevel > 8) {
            System.out.println("High school");
        }

        if (gradeLevel <= 16 && gradeLevel > 12) {
            System.out.println("Collage");
        }

        if (gradeLevel <= 18 && gradeLevel > 16) {
            System.out.println("Grad school");
        }
    }
}

/*

2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school 
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
        	
 */