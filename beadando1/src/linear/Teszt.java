package linear;

public class Teszt {
    public static void main(String[] args) {
        LinearEquation l1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation l2 = new LinearEquation(10, 9, 8, 7, 6, 5);
        LinearEquation l3 = new LinearEquation(0, 0, 0, 0, 0, 0);

        if (l1.isSolvable())
            System.out.println(l1);
        else System.out.println("This equation has no solution.");

        if (l2.isSolvable())
            System.out.println(l2);
        else System.out.println("This equation has no solution.");

        if (l3.isSolvable())
            System.out.println(l3);
        else System.out.println("This equation has no solution.");
    }
}