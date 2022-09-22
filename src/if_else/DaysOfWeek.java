package if_else;
import java.util.Scanner;

//8. Print days of week (use if-else or switch)

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a week number: ");
        int week= scanner.nextInt();
        printWeekDay(week);
    }

    public static void printWeekDay(int week){
        switch (week){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("this number is invalid");
                break;
        }
    }
}
