package if_else;
import java.util.Scanner;

//5. Take input number from user and check if it is divisible by 5 and 7 or not.


public class DivisibleBy5_7 {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");
        num= scanner.nextInt();
        if(num % 5 ==0 && num % 7 == 0){
            System.out.println("number is Divisible by 5 and 7");
        }else{
            System.out.println("number is not Divisible by 5 and 7");
        }
    }
}
