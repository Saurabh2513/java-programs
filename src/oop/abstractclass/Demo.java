package oop.abstractclass;
import java.util.*;
abstract class mobile{
  public   mobile() {
        System.out.println("ringing");
}
}
class display extends mobile{
public display(){
    System.out.println("shoe images");
}
public void video(){
    System.out.println("play a video");
}
}
public class Demo {
    public static void main(String[] args) {
mobile m = new display();
mobile m2= new mobile(){

};
    }
}
