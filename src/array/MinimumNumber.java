package array;
//3. Get 5 numbers from user and show the minimum number among them

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number:" + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) ;
            minimum = arr[i];
        }
        System.out.println("minimum number is=" + minimum);
    }
}

