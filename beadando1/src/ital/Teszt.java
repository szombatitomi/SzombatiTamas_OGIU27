package ital;

public class Teszt {
    public static void main(String[] args) {
        Ital i1 = new Ital("Pálinka", "5 dl");
        Ital i2 = new Ital("Pálinka", "5 dl");

        System.out.println(i1);
        System.out.println(i2);

        System.out.println(i1.equals(i2));
    }
}