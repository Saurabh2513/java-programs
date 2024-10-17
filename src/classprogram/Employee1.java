package classprogram;

//Function Overloading
public class Employee1 {
    private int empId;
    private String name;

    public Employee1(int e, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void display() {
        System.out.println("EmpId:" + empId + "name:" + name);
    }

    public void display(int e) {
        this.empId = empId + e;
        System.out.println(empId);
    }

    public void display(String s) {
        System.out.println(name);
    }

    public void display(int e, String s) {
        this.empId = empId + e;
        System.out.println(empId+name);
    }

    public void display(String s, int e) {
        this.empId = empId + e;
        System.out.println(name+empId);
    }

    public static void main(String[] args) {
        int a = 10;
        float f;
        f = a;
        System.out.println(f);

        double f1 = 10.5;
        int i = (int) f1;
        System.out.println("i=" + i);

        Employee1 e1 = new Employee1(14,"  sagar");
        e1.display();
        e1.display(1);
        e1.display("employee");
        e1.display(1,"AAAA");
        e1.display("BBBB",15);

    }
}
