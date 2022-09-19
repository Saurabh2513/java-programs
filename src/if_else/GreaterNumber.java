package if_else;
import java.util.Scanner;
//1. Take 2 numbers from user and check which one is greater

public class GreaterNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1:");
        num1 = scanner.nextInt();
        System.out.println("enter num2:");
        num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("num1 greater than num2");
        }
        else{
            System.out.println("num2 greater than num1");
        }
    }
}
