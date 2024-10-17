package encapsulation;

public class Emp {
    private int empId;
    private String empName;
    private float sal;

    private void setData(int empId,String empName,float sal){
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }
    public void display(){
        System.out.println("Id:"+empId+"Name"+empName+"Sal"+sal);
    }
    public void setSal(){
        this.sal=sal;
    }

    public float getSal() {
        return sal;
    }
}
class Manager extends Emp{
    private float incentives;
    public void setIncentives(int incentives){
     this.incentives=incentives;
    }

    public float getIncentives() {
        return incentives;
    }
}
