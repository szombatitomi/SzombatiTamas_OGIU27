package metodusok;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Metódusok {
    public static TreeSet elso(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        return set;
    }

    public static double[] masodik(double a, double b, double c) {
        double[] megoldas = new double[2];
        double[] tomb = new double[3];
        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;
        double min = tomb[0];
        for (int i = 1; i < 3; i++) {
            if (tomb[i] < tomb[i-1])
                min = tomb[i];
        }
        megoldas[0] = min;
        tomb[0] = Math.abs(a);
        tomb[1] = Math.abs(b);
        tomb[2] = Math.abs(c);
        double max = tomb[0];
        for (int i = 1; i < 3; i++) {
            if (tomb[i] > tomb[i-1])
                max = tomb[i];
        }
        megoldas[1] = max;
        return megoldas;
    }

    public static double[] harmadik(double a, double b, double c, double d) {
        double[] tomb = new double[4];
        double seged;
        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;
        tomb[3] = d;
        for (int i = 0; i < 4; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();
        if (d >= 0) {
            tomb[1] = c;
            tomb[2] = b;
            return tomb;
        }
        else {
            tomb[1] = b;
            tomb[2] = d;
            tomb[3] = c;
            return tomb;
        }
    }

    public static boolean negyedik(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return false;
        if (a < b+c && b < a+c && c < a+b)
            return true;
        else return false;
    }

    public static int otodik(int a, int b) {
        int szokoev = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0 )
                szokoev++;
        }
        return szokoev;
    }

    public static String hatodik(int a) {
        String jegy;
        switch(a) {
            case 1:
                jegy = "Elégtelen";
                break;
            case 2:
                jegy = "Elégséges";
                break;
            case 3:
                jegy = "Közepes";
                break;
            case 4:
                jegy = "Jó";
                break;
            case 5:
                jegy = "Jeles";
                break;
            default:
                jegy = "Nincs ilyen osztályzat!";
                break;
        }
        return jegy;
    }

    public static int hetedik(int a, int b) {
        int hanyados = 0;
        while (a >= b) {
            hanyados = hanyados + 1;
            a = a-b;
        }
        return hanyados;
    }

    public static boolean nyolcadik(int n)
    {
        if (n == 0 || n == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static int[] kilencedik(int n) {
        if (n == 1) {
            int[] tomb1 = new int[1];
            tomb1[0] = 0;
            return tomb1;
        }
        if (n == 2) {
            int[] tomb1 = new int[2];
            tomb1[0] = 0;
            tomb1[1] = 1;
            return tomb1;
        }
        int[] tomb = new int[n];
        tomb[0] = 0;
        tomb[1] = 1;

        for (int i = 2; i < n; i++) {
                tomb[i] = tomb[i - 1] + tomb[i - 2];
        }

        return tomb;
    }

    public static int tizedik(int n) {
        int ujszam = 0;
        while (n != 0) {
            ujszam = ujszam * 10 + n % 10;
            n = n/10;
        }
        return ujszam;
    }

    public static long tizenegyedik(int n) {
        long faktor = 1;
        for (int i = n; i > 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static List tizenkettedik(int n1, int n2) {
        ArrayList<Integer> lista = new ArrayList<>();
        int k = 3;
        for (int i = n1; i <= n2; i++) {
            if (i % k == 0)
                lista.add(i);
        }
        return lista;
    }

    public static int tizenharmadik(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0, 0);
        lista.add(1, 1);

        int i = 2;
        while(true) {
            lista.add(lista.get(i-1)+lista.get(i-2));
            if (lista.get(i) > n)
                break;
            i++;
        }
        return lista.get(i);
    }

    public static List tizennegyedik() {
        ArrayList<Integer> szamjegyek = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int szam = i;
            while (szam > 0) {
                szamjegyek.add(szam % 10);
                szam = szam / 10;
            }
            int osszeg = 0;
            for (int j = 0; j < szamjegyek.size(); j++) {
                osszeg += szamjegyek.get(j)*szamjegyek.get(j)*szamjegyek.get(j);
            }
            if (osszeg == i)
                lista.add(i);
            szamjegyek.clear();
        }
        return lista;
    }

    public static void main(String[] args) {
        System.out.println("1. feladat:");
        System.out.println(elso(9, 2, 4));

        System.out.println();

        System.out.println("2. feladat:");
        double[] kettes = masodik(3.5, -2.2, -9.0);
        System.out.println("Minimum: " + kettes[0] +
                ", Maximum: " + kettes[1]);

        System.out.println();

        System.out.println("3. feladat:");
        double[] harmas = harmadik(4.0, 2.5, 9.2, 42.0);
        System.out.println(harmas[0] + " " + harmas[1] + " " + harmas[2] +
                " " + harmas[3]);

        System.out.println();

        System.out.println("4. feladat:");
        System.out.println(negyedik(10, 15, 20));

        System.out.println();

        System.out.println("5. feladat:");
        System.out.println(otodik(1600, 2000));

        System.out.println();

        System.out.println("6. feladat:");
        System.out.println(hatodik(5));

        System.out.println();

        System.out.println("7. feladat:");
        System.out.println(hetedik(10, 4));

        System.out.println();

        System.out.println("8. feladat:");
        System.out.println(nyolcadik(13));

        System.out.println();

        System.out.println("9. feladat:");
        int[] kilences = kilencedik(11);
        for (int i = 0; i < kilences.length; i++) {
            System.out.print(kilences[i] + " ");
        }
        System.out.println();

        System.out.println();

        System.out.println("10. feladat:");
        System.out.println(tizedik(39764));

        System.out.println();

        System.out.println("11. feladat:");
        System.out.println(tizenegyedik(5));

        System.out.println();

        System.out.println("12. feladat:");
        System.out.println(tizenkettedik(5, 16));

        System.out.println();

        System.out.println("13. feladat:");
        System.out.println(tizenharmadik(25));

        System.out.println();

        System.out.println("14. feladat:");
        System.out.println(tizennegyedik());
    }
}