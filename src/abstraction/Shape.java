package abstraction;

public abstract class Shape {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int r;

    public int getR() {
        return r;
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
        System.out.println("X = " + getX() + "y = " + getY() + "r = " + r);
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape t = new Shape() {
            @Override
            public void draw() {
                System.out.println("draw circle from Shape");
            }
        };
        s.draw();
        t.draw();
    }
}