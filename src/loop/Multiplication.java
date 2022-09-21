package loop;
import java.util.Scanner;
//4. Input number from user and print the multiplication table of that number

public class Multiplication {
    public static void main(String[] args)
    {
        int n,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");
        n= scanner.nextInt();

        for(j=1;j<=10;j++)
        {
            System.out.println(n*j);
        }
    }
}