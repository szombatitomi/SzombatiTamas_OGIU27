package quadratic;

public class Test {
    public static void main(String[] args) {
        QuadraticEquation e1 = new QuadraticEquation(4, 6, 2);
        QuadraticEquation e2 = new QuadraticEquation(1, 4, 4);
        QuadraticEquation e3 = new QuadraticEquation(1, 2, 3);

        if (e1.getDiscriminant() > 0)
            System.out.println(e1.getRoot1() + ", " + e1.getRoot2());
        else if (e1.getDiscriminant() == 0)
            System.out.println(e1.getRoot1());
        else System.out.println("The equation has no roots.");

        if (e2.getDiscriminant() > 0)
            System.out.println(e2.getRoot1() + ", " + e2.getRoot2());
        else if (e2.getDiscriminant() == 0)
            System.out.println(e2.getRoot1());
        else System.out.println("The equation has no roots.");

        if (e3.getDiscriminant() > 0)
            System.out.println(e3.getRoot1() + ", " + e3.getRoot2());
        else if (e1.getDiscriminant() == 0)
            System.out.println(e3.getRoot1());
        else System.out.println("The equation has no roots.");
    }
}