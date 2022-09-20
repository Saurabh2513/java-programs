package if_else;
import java.util.Scanner;

//7. Calculator

public class Calculator {
    public static void main(String[] args) {

        int  number1, number2, result;
        char operator = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        number2 = scanner.nextInt();


        System.out.println("Choose an operator:\n1.Addition + \n2.Subtraction - \n3.Multiplication * \n4.Division / ");
        operator = scanner.next().charAt(0);



        switch (operator) {

            case '1':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '2':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '3':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '4':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}