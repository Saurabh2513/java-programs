package inheritance;

import java.util.*;

class Base {
    Base() {
        System.out.println("first Base class");
    }

    Base(int a) {
        System.out.println("second Bse class \n" + a);
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }
}

class Derived extends Base {

    Derived() {
        super(50);
        System.out.println("Derived class one");
    }

    int y;

    public int getY() {
        System.out.println("I am in Derived and setting Y now");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        // Base b = new Base();
        //   b.setX(4);
        // System.out.println(b.getX());

        Derived d = new Derived();

    }
}

