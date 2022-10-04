package array;

//5. Get 10 numbers from user and show them in descending order.

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
        System.out.println("enter number:" + (i + 1));
        arr[i] = scanner.nextInt();
            System.out.println(arr[i]+" ");

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}