package ClassAssin;

import java.util.Scanner;
public class Q7_Employee {
    int salary;
    String name;
    int workHours;
    int newSalary;
    int ExtraHours;
    public Q7_Employee(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter name of employee:");
            this.name = scanner.next();
        }
    }
    public void getInfo(int s,int n){
        this.salary=s;
        this.ExtraHours=n;
    }
    public void AddSalary(){
        if(salary<=500){
            this.newSalary=salary+10;
            System.out.println(newSalary);
        }
    }
    public void AddWork(){
        if (workHours>6){
            this.ExtraHours=workHours-6;
            newSalary=newSalary+(5*ExtraHours);
            System.out.println(newSalary);
        }

    }
    public static void main(String[] args) {
        Q7_Employee e1 = new Q7_Employee();
        e1.getInfo(500,8);
        e1.AddSalary();
        e1.AddWork();
    }
}
