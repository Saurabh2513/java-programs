package if_else;
import java.util.Scanner;

//4. Take input number from user and check if it is divisible by 5 or not.

public class Divisible5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");
        num= scanner.nextInt();
        int modValue = num % 5;

        System.out.println("Mod val : "+ modValue);


    }
}
