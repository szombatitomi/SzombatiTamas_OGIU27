package feladat3;

import java.util.Arrays;

public class Teszt {
    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] tomb) {
        int n = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) tomb[i];
                for (int j = 0; j < k.getSörlap().length; j++) {
                    if (k.getSörlap()[j].equals(ital)) {
                        n++;
                    }
                }
            }
        }
        Kocsma[] kocsma = new Kocsma[n];
        n = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] instanceof Kocsma) {
                Kocsma p = (Kocsma)tomb[i]; //attol hogy megvizsgaljuk, meg nem latja peksegnek, csak KE-nek, castolni kell
                for (int j = 0; j < p.getSörlap().length; j++) {
                    if (p.getSörlap()[j].equals(ital)) {
                        kocsma[n] = p;
                        n++;
                    }
                }
            }
        }
        return kocsma;
    }

    public static void main(String[] args) {
        VendéglátóipariEgység[] tomb = new VendéglátóipariEgység[10];

        String[] étlap = {"Rántott karaj", "Gyros pitában", "Hamburger"};

        tomb[0] = new Étterem("Étterem1", 15, false, étlap);
        tomb[1] = new Étterem("Étterem2", 20, false, étlap);
        tomb[2] = new Étterem("Étterem3", 35, false, étlap);
        tomb[3] = new Étterem("Étterem4", 50, false, étlap);
        tomb[4] = new Étterem("Étterem5", 75, false, étlap);
        tomb[5] = new Kocsma("Kocsma1", 15, true, new String[] {"Heineken", "Kozel", "Stella Artois"});
        tomb[6] = new Kocsma("Kocsma1", 20, true, new String[] {"Budweiser", "Kozel", "Miller"});
        tomb[7] = new Kocsma("Kocsma1", 35, true, new String[] {"Heineken", "Steffl", "Soproni"});
        tomb[8] = new Kocsma("Kocsma1", 50, true, new String[] {"Soproni", "Borsodi", "Stella Artois"});
        tomb[9] = new Kocsma("Kocsma1", 75, true, new String[] {"Kozel", "Steffl", "Heineken"});

        Kocsma[] k = adottItaltKínálóKocsmák("Heineken", tomb);

        System.out.println(Arrays.toString(k));

    }
}