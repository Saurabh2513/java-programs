package array;
//6. Write a program to get 10 numbers from user and show minimum & maximum number among them.

import java.util.Scanner;

public class MinimuMax {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number:" + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("max number is=" + max);
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            System.out.println("minimum number is=" + minimum);
            break;
        }
    }
}