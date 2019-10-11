package feladat2;

public class Teszt {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1, 1.5, 1);
        t1.setColor("yellow");
        t1.setFilled(true);

        System.out.println(t1);
        System.out.println("Area: " + t1.getArea() + ", Perimeter: " + t1.getPerimeter());
        System.out.println("isFilled: " + t1.isFilled() + ", color: " + t1.getColor());
    }
}
