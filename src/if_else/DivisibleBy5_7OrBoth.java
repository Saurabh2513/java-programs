package if_else;
import java.util.Scanner;

//6. Take input number from user and check if it is divisible by 5 or 7 or both.

public class DivisibleBy5_7OrBoth {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        num= scanner.nextInt();
        if(num % 5 == 0){
            System.out.println("number is divisible by 5");
        } else if (num % 7 == 0) {
            System.out.println("number is divisible by 7");
        }else{
            System.out.println("number is not divisible by 5 and 7");
        }
    }
}
