package if_else;
import java.util.Scanner;

//2. Take 3 numbers from user and check which one is greater

public class ThreeNumberGreater {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1: ");
        num1= scanner.nextInt();
        System.out.println("enter num2: ");
        num2= scanner.nextInt();
        System.out.println("enter num3: ");
        num3= scanner.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is greater than num2,num3");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is greater than num1,num3");
        }else{
            System.out.println("num3 is greater than num1,num2");
        }
    }
}
