package if_else;
import java.util.Scanner;
/*10. Create program to determine Student is Pass or Fail.
        Take marks of 5 subjects.
        English, Marathi, Hindi, Maths, Geo.
        Check if Student has failed in any subject. if student is failed in any subject then show the subject name and marks.
        If student is pass then show the percentage.
 */
public class StudentMarks {
  public static void main(String[] args) {
    int count = 0;
    char operator = 0;
    double total=0, average, percentage;
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter student name:");
    String name = scanner.next();

    System.out.println("enter student marks: \nEnglish: ");
    int english = scanner.nextInt();

    System.out.println("Marathi: ");
    int marathi = scanner.nextInt();

    System.out.println("Hindi: ");
    int hindi = scanner.nextInt();

    System.out.println("Maths: ");
    int maths = scanner.nextInt();

    System.out.println("Geo: ");
    int geo = scanner.nextInt();

    if(100 == 30){
      System.out.println("Student is fail in English he has 30 marks.");
    }
    else if(100==30){
      System.out.println("Student is fail in Marathi he has 30 marks.");
    }
    else if(100==30){
      System.out.println("Student is fail in Hindi he has 30 marks.");
    }
    else if(100==30){
      System.out.println("Student is fail in Maths he has 30 marks.");
    }
    else if(100==30){
      System.out.println("Student is fail in Geo he has 30 marks.");
    }
    else if(30 <= 100){
      System.out.println("student fail in all subject ");
    }
    else{
      System.out.println("student has all subject clear");
    }

    System.out.println("total of all marks please enter '+'");
    operator = scanner.next().charAt(0);

    switch (operator){
      case '+':
        total = english + marathi + hindi + maths + geo;
        System.out.println("Total is: " + total);


        System.out.println("percentage of all marks please enter '%'");
        operator = scanner.next().charAt(0);

      case '%':
        percentage = (total/500.0)*100;
        System.out.println("Total Percentage : " + percentage + "%");

        }
    }
  }



