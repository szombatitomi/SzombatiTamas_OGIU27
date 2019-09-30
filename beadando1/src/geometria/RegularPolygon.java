package geometria;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(int n, double side) {
        return n*side;
    }

    public double getArea(int n, double side) {
        double p = n*side;
        double deg = Math.toRadians(180);
        double a = side/(2*Math.tan(deg/n));
        return (p*a)/2;
    }

    @Override
    public String toString() {
        return n + " oldalú, " + side + " oldalhosszúságú sokszög:\nKerület: " +
                this.getPerimeter(this.n, this.side) + ", Terület: " +
                this.getArea(this.n, this.side);
    }
}