public class Rectangle extends Shape{

    public Rectangle(int length, int breadth, int i){
        super(length,breadth, 0);
    }
    public double printArea(){
        return getA() * getB();
    }
}
