package day21_ForEachLoop;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {

    public static void main(String[] args) {

        int[] arr = {4, 1, 5, 3, 0, 2};

        Arrays.sort(arr);
        int[] decendingOrder = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            decendingOrder[j] = arr[i];
        }

        System.out.println(Arrays.toString(decendingOrder));


    }
}

/*
	1. Write a program that sort the array of integer in descending order

 */