package inheritance;

public class Child extends Parent{
    final int age=15;
    final String job="15";

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent ref = new Child();
        //method hiding
        p.print(15,"15");
        c.print(15,"15");
        ref.print(15,"15");

        OldInterface.news();
    }


}
