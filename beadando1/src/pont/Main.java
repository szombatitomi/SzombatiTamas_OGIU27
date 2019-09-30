package pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont(5,10);
        Pont p2 = new Pont(2,3);
        Pont p3 = new Pont(21,23);
        Pont p4 = new Pont(9, 5);

        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX(p2.getX()-3.4);
        p4.setX(p4.getX()-3.4);

        System.out.println("p1: " + p1.getX() + ", " + p1.getY());
        System.out.println("p2: " + p2.getX() + ", " + p2.getY());
        System.out.println("p3: " + p3.getX() + ", " + p3.getY());
        System.out.println("p4: " + p4.getX() + ", " + p4.getY());
    }
}