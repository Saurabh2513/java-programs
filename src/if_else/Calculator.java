package if_else;
import java.util.Scanner;

//7. Calculator

public class Calculator {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1 number: ");
        num1 = scanner.nextInt();
        System.out.println("enter num2 number: ");
        num2 = scanner.nextInt();
        System.out.println("Please select operation :\n"
                + "1.Addition: \n" + "2.Subtraction: \n" + "3.Subtraction \n" + "4.Multiplication \n");
        Scanner op = new Scanner(System.in);
        String operation = op.next();

        if (operation.equals("+")) {
            System.out.println("Your Answer: " + (num1 + num2));
            if (operation.equals("-")) {
                System.out.println("Your Answer: " + (num1 - num2));
                if (operation.equals("%")) {
                    System.out.println("Your Answer: " + (num1 % num2));
                    if (operation.equals("*")) {
                        System.out.println("Your Answer: " + (num1 * num2));
                    }
                }

            }
        }
    }
}
