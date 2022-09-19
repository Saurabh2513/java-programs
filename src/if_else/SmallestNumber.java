package if_else;
import java.util.Scanner;

//3. Print smallest number among three.


public class SmallestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1: ");
        num1 = scanner.nextInt();
        System.out.println("enter num2: ");
        num2 = scanner.nextInt();
        System.out.println("enter num3: ");
        num3 = scanner.nextInt();
       if(num1 < num2 && num1 < num3){
           System.out.println("num1 is small than num2 and num3");
       } else if(num2 < num1 && num2 < num3){
           System.out.println("num2 is small than num1 and num3");
       }else{
           System.out.println("num3 is small than num1 and num2");
       }
    }
}
