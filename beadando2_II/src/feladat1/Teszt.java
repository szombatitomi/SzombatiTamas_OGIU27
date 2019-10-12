package feladat1;

public class Teszt {
    public static Katona megkuzd(Katona k1, Katona k2) {
        if (k2.getTamado() > k1.getVedo())
            return k2;
        else return k1;
    }

    public static void main(String[] args) {
        Katona k1 = new Nyilas(5, 9, 10);
        Katona k2 = new Nyilas(10, 4, 10);
        Katona k3 = new Landzsas(25, 8);

        Katona gyoztes = megkuzd(k1, k2);
        System.out.println(k1 + " és " + k2 + " küzdelme   -   GYŐZTES: " + gyoztes);

        Katona gyoztes2 = megkuzd(gyoztes, k3);
        System.out.println(gyoztes + " és " + k3 + " küzdelme   -   GYŐZTES: " + gyoztes2);

    }
}