package feladat1;

public class Main {

    private static Aszu[] otputtony (Bor[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    count++;
                }
            }
        }
        Aszu[] aszutomb = new Aszu[count];
        count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    aszutomb[count++] = a;
                }
            }
        }
        return aszutomb;
    }

    public static void main(String[] args) {
        Bor[] b1 = new Bor[5];
        b1[0] = new Bor("Édes", 7.5, "Hárslevelű", "Tokaj");
        b1[1] = new Aszu("Édes", 8.3, "Aszú", "Tarcal", 5);
        b1[2] = new Aszu("Édes", 7.8, "Aszú", "Tokaj", 5);
        b1[3] = new Bor("Félédes", 9.3, "Hárslevelű", "Villány");
        b1[4] = new Bor("Száraz", 7.9, "Kékszőlő", "Eger");

        Aszu[] asz = otputtony(b1);

        for (Aszu j : asz)
            System.out.println(j);
    }
}