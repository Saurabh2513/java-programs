package array;

import java.util.Scanner;
//7. Get 5 numbers from user and show the average number.

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array:");
        int num = scanner.nextInt();
        double[] arr = new double[num];
        System.out.println("enter\t"+num+"\telement array:");
        double sum = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }
        System.out.println("Average is:" + sum / num);
    }
}