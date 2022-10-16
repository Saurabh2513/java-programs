package inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name+" bhoooo!");
    }

    public void move() {
    System.out.println(name + " is running. ");
    }
    public void play() {
        System.out.println(name+" play with boll ");
    }
}
