package org.restfultoad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i <= arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0)
                break;
        }

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }

}