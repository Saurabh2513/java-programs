package inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name+" meooo!");
    }

    public void move() {
        System.out.println(name + " is running. ");
    }
    public void play() {
        System.out.println(name+" play with boll ");
    }
    public void eat() {
        System.out.println(name+" eat the mouse ");
    }
}


