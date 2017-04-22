package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017. 04. 22..
 */
public class Triangle extends AbstractShape{

    private float a;
    private float b;
    private float c;
    private float beta;

    public Triangle(float a, float b, float c, float beta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.beta = beta;
    }

    public float getArea() {
        return a + b + c;
    }

    public float getPerimeter() {
        return (a * beta) / 2;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    @Override
    public String toString() {
        return "Triangle Area: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
