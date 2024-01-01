package day21_ForEachLoop;

public class JavaAndPhyton {

    public static void main(String[] args) {

        /* This is my solution without using split() method

        String sentence = "Java and Python are coll but Java is better than Python so I am learning Java";

        int countWord = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == ' ') {
                countWord++;
            }

        }

        String[] arr = new String[countWord + 1];

        int indexArr = 0;
        int j = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == ' ') {
                String word = sentence.substring(j, i);
                arr[indexArr++] = word;
                j = i + 1;

                if (indexArr == countWord) {
                    word = sentence.substring(j, sentence.length());
                    arr[indexArr] = word;
                }
            }

        }

        System.out.println(Arrays.toString(arr));

        int countJava = 0,
                countPython = 0;

        for (String each : arr) {
            if (each.equalsIgnoreCase("java")) {
                countJava++;
            } else if (each.equalsIgnoreCase("python")) {
                countPython++;
            }
        }

        System.out.println(countJava + " Java and " + countPython + " Python");

         */

        String sentence = "java java python python java python";
        String[] words = sentence.split(" ");

        int countJava = 0,
                countPython = 0;

        for (String each : words) {
            if (each.equalsIgnoreCase("java")) {
                countJava++;
            } else if (each.equalsIgnoreCase("python")) {
                countPython++;
            }
        }

        System.out.println(countJava + " Java and " + countPython + " Python");

    }
}

/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */