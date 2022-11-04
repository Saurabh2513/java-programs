package classprogram;

class MyEmployee {
    private int id;
    private String name;

    public int getId() {

        return id;
    }

    public void setId(int i) {

        this.id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee x = new MyEmployee();
        x.setId(45);
        System.out.println("id:"+x.getId());
        x.setName("sagar");
        System.out.println("name:"+x.getName());
    }
}
