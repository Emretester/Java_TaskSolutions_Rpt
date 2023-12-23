package day20_Arrays;

public class Classmates_Reverse {

    public static void main(String[] args) {

        String[] classmates = {"Ali", "Veli", "Hasan"};

        for (int i = 0; i < classmates.length; i++) {
            String eachName = classmates[i];
            String reversedName = "";

            for (int j = eachName.length() - 1; j >= 0; j--) {
                char ch = eachName.charAt(j);
                reversedName += ch;
            }

            System.out.println(reversedName);

        }
    }
}

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */