package if_else;

import java.util.Scanner;

/*10. Create program to determine Employee1 is Pass or Fail.
        Take marks of 5 subjects.
        English, Marathi, Hindi, Maths, Geo.
        Check if Employee1 has failed in any subject. if student is failed in any subject then show the subject name and marks.
        If student is pass then show the percentage.
*/
public class StudentMarks {
    public static void main(String[] args) {
        int english, marathi, hindi, maths, geo,total;
        float percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student Name: ");
        String name=scanner.next();
        System.out.println("enter student marks: ");
        System.out.println("1.english:");
        english = scanner.nextInt();
        System.out.println("2.marathi:");
        marathi = scanner.nextInt();
        System.out.println("3.hindi:");
        hindi = scanner.nextInt();
        System.out.println("4.maths:");
        maths = scanner.nextInt();
        System.out.println("5.geo:");
        geo = scanner.nextInt();
        if (english <= 35) {
            System.out.println(name+ "student it is fail in english");
        } else if (marathi <= 35) {
            System.out.println(name+ "student it is fail in marathi");
        } else if (hindi <= 35) {
            System.out.println(name+ "student it is fail in hindi");
        } else if (maths <= 35) {
            System.out.println(name+ "student it is fail in maths");
        } else if (geo <= 35) {
            System.out.println(name+ "student it is fail in geo");
        }else if(100>35){
            System.out.println(name+  "you hava all subject clear :)");
        }else{
            System.out.println(name+ "you hava all subject fail");
        }
        total=english+marathi+hindi+maths+geo;
        System.out.println("total ="+total);
        percentage=(total/500.0f)*100;
        System.out.println("Percentage = "+percentage+"%");
   }
}

