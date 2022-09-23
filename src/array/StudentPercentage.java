package array;

import java.util.Scanner;
//1. Get Marks of 5 students and show the percentage

public class StudentPercentage {
    public static void main(String[] args) {
        float[] marks = {56, 54, 84, 75, 65};
        float sum = 0, percentage = 0;

        for (float student : marks) {
            sum = sum + student;
        }
        System.out.println("student marks total =" + sum);
        for (float student : marks) {
            percentage = (float) ((sum / 500.0) * 100);
        }
        System.out.println("student percentage =" + percentage + "%");

    }
}

