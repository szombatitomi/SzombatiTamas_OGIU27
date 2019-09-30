package quadratic;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b*this.b-4*this.a*this.c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0)
            return -this.b+Math.sqrt(this.getDiscriminant())/(2*this.a);
        else return 0;
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0)
            return -this.b-Math.sqrt(this.getDiscriminant())/(2*this.a);
        else return 0;
    }

    @Override
    public String toString() {
        return "A: " + a + " B: " + b + " C: " + c;
    }
}