package iskola;

import java.util.Scanner;

public class Main extends Orarend {
    public boolean oratHozzaad(Ora ora) {
        if (super.getCounter() >= 12)
            return false;
        else {
            if (super.getKezdes() == ora.getKezdes())
                return false;
            else {
                new Ora(ora.getKod(), ora.getNev(), ora.getKezdes());
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = sc.nextLine();
        int orakszama = Integer.parseInt(sc.nextLine());
        Ora[] tomb = new Ora[orakszama];
        for (int i = 0; i < orakszama; i++) {
            int kod = Integer.parseInt(sc.nextLine());
            String nev = sc.nextLine();
            int kezdes = Integer.parseInt(sc.nextLine());
            tomb[i] = new Ora(kod, nev, kezdes);
            Orarend rend = new Orarend(nap);
        }
    }
}