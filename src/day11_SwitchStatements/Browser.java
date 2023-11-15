package day11_SwitchStatements;

public class Browser {

    public static void main(String[] args) {

        String browserName = "edge";

        switch (browserName) {

            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                System.out.println("Selected browser: " + browserName);
                break;
            default:
                System.out.println("Invalid browser");
        }
    }
}

/*

3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */