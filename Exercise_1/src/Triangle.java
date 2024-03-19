public class Triangle extends Shape {
    public Triangle(int length, int breadth, int height) {
        super(0, breadth, height);
    }

    public double printArea(){
        return 0.5 * getA() * getC();
    }
}
