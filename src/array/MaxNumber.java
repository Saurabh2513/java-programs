package array;
//2. Get 5 numbers from user and show the max number among them

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter num" + (i + 1));
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[0];
            }
        }
        System.out.println("max number is=" + max);

    }
}