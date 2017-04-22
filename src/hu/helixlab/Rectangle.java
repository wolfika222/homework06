package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017. 04. 22..
 */
public class Rectangle extends AbstractShape {

    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getPerimeter() {
        return a * b;
    }

    public float getArea() {
        return 2 * (a + b);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle Area: " + getArea() + "\nRectangle Perimeter: " + getPerimeter();
    }
}
