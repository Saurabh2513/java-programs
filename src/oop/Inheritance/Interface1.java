package oop.Inheritance;

import java.util.*;

interface client {
    void input();

    void output();
}

class pro implements client {
    String name;
    double sal;

    @Override
    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("enter user name:");
        name = r.nextLine();
        System.out.println("enter employee salary:");
        sal = r.nextDouble();
    }

    @Override
    public void output() {
        System.out.println(name + " " + sal);
    }
}

public class Interface1 {
    public static void main(String[] args) {
        client c = new pro();
        c.input();
        c.output();
    }
}
