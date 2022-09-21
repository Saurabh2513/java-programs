package loop;
import java.util.Scanner;
//4. Input number from user and print the multiplication table of that number

public class FactorialNumber {
    public static void main(String[] args) {
        int n,i,number=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
        n= scanner.nextInt();

        for(i=1;i<=n;i++){
          number=n*i;
        }
        System.out.println("Factorial of "+n+" is: "+number);
    }
}
