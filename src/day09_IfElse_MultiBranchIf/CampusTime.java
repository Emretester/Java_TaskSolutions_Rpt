package day09_IfElse_MultiBranchIf;

public class CampusTime {

    public static void main(String[] args) {

        int time = 23;
        String status;

        if (time >= 8 && time <= 23) {
            status = "open";
        } else {
            status = "close";
        }

        System.out.println(status);

    }
}

/*

1.  Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been initialized, write a program that can find out if the campus is open or not. Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”  but if the time entered is outside of operating hours they should see: “ closed”

 */