package pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        num = scanner.nextInt();
//outer loop for rows
        for (i = 0; i < num; i++) {
//inner loop for columns
            for (j = 0; j <= i; j++) {
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}


