package if_else;
import java.util.Scanner;
//9. Print month of year (use if-else or switch)

public class MonthOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter month of year: ");
        int month=scanner.nextInt();
        if(month==1) System.out.println("january");
        else if (month==2) {
            System.out.println("february");
        }else if (month==3) {
            System.out.println("march");
        }else if (month==4) {
            System.out.println("april");
        }else if (month==5) {
            System.out.println("may");
        }else if (month==6) {
            System.out.println("june");
        }else if (month==7) {
            System.out.println("july");
        }else if (month==8) {
            System.out.println("august");
        }else if (month==9) {
            System.out.println("september");
        }else if (month==10) {
            System.out.println("october");
        }else if (month==11) {
            System.out.println("november");
        }else if (month==12) {
            System.out.println("december");
        }else
            System.out.println("there is number invalid");
        }
    }

