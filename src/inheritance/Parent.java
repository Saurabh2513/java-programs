package inheritance;

public  class Parent implements OldInterface  {
    final int age=15;
    final String job="15";

    public void print(int age, String job) {
        System.out.println("Values are" + age + job);
    }

}

