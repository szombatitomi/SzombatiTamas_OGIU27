package ital;

public class Dolgozat {
    public static SzeszesItal[] top3 (Ital[] it) {
        SzeszesItal[] visszaad = new SzeszesItal[3];
        SzeszesItal tmp;
        int count = 0;
        for (int i = 0; i < it.length; i++) {
            if (it[i] instanceof SzeszesItal) {
                count++;
            }
        }
        SzeszesItal[] onlyszesz = new SzeszesItal[count];
        count = 0;
        for (int i = 0; i < it.length; i++) {
            if (it[i] instanceof SzeszesItal) {
                onlyszesz[count++] = (SzeszesItal) it[i];
            }
        }
        for (int i = 0; i < onlyszesz.length; i++) {
            for (int j = i+1; j < onlyszesz.length; j++) {
                if (onlyszesz[i].getAlkoholTartalom() < onlyszesz[j].getAlkoholTartalom()) {
                    tmp = onlyszesz[i];
                    onlyszesz[i] = onlyszesz[j];
                    onlyszesz[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            visszaad[i] = onlyszesz[i];
        }

        return visszaad;
    }

    public static void main(String[] args) {
        Ital[] italtomb = new Ital[11];
        italtomb[0] = new Ital("Coca-cola", "1.5 l", 300);
        italtomb[1] = new SzeszesItal("Johnny Walker whisky", "0.7 l", 4800, 43);
        italtomb[2] = new SzeszesItal("Egri bikavér", "0.7 l", 1500, 7);
        italtomb[3] = new SzeszesItal("Szilvapálinka", "0.5 l", 4500, 51);
        italtomb[4] = new Ital("Sió baracklé", "0.33 l", 450);
        italtomb[5] = new Ital("Fanta narancs", "2.5 l", 490);
        italtomb[6] = new SzeszesItal("Royal vodka", "1 l", 3500, 41);
        italtomb[7] = new SzeszesItal("Tokaji aszú", "0.5 l", 3000, 8.5);
        italtomb[8] = new SzeszesItal("Heineken sör", "0.5 l", 350, 4.5);
        italtomb[9] = new SzeszesItal("Borsodi sör", "0.5 l", 250, 5.2);
        italtomb[10] = new Ital("Ásványvíz", "0.5 l", 200);

        SzeszesItal[] sztomb = top3(italtomb);

        for (SzeszesItal j : sztomb)
            System.out.println(j);

        System.out.println("\n--- A RENDEZETT TÖMB --- (Nem volt megadva, hogy mi szerint, ár szerint növekvőbe rendeztem.)\n");

        Ital tmp;
        for (int i = 0; i < italtomb.length; i++) {
            for (int j = i+1; j < italtomb.length; j++) {
                if (italtomb[i].getÁr() > italtomb[j].getÁr()) {
                    tmp = italtomb[i];
                    italtomb[i] = italtomb[j];
                    italtomb[j] = tmp;
                }
            }
        }

        for (Ital j : italtomb)
            System.out.println(j);
    }
}