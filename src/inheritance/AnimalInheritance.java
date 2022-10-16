package inheritance;
import java.awt.*;
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("hello!");
    }
    public void move() {
        System.out.println(name + " is moving like animal. ");
    }
    public String getName() {
        return this.name;
    }
}
public class AnimalInheritance {
    public static void main(String[] args) {
        Animal a = new Animal("Animal");
        Dog d = new Dog("Dog");
        Cat c = new Cat("kitty");
        System.out.println("Animal a: ");
        a.speak();
        a.move();
        System.out.println();
        System.out.println("Dog d: ");
        d.speak();
        d.move();
        d.play();
        System.out.println();
        System.out.println("Cat c: ");
        c.speak();
        c.move();
        c.play();
        c.eat();
        System.out.println();
    }
}