package rectangle;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public double getArea() {
        return this.width*this.height;
    }

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getPerimeter() {
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "Szélesség: " + width + ", Magasság: " + height +
                " | Terület: " + this.getArea() + ", Kerület: " + this.getPerimeter();
    }
}