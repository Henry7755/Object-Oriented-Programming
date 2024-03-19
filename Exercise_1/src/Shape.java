public abstract class Shape {
    private int a,b,c;

    public Shape(int length, int breadth, int height) {
        a = length;
        b = breadth;
        c = height;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public abstract double printArea();

}
