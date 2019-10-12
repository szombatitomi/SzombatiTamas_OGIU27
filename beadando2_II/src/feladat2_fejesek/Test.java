package feladat2_fejesek;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] token = sc.nextLine().split(";");
        Diák[] d = new Diák[Integer.parseInt(token[0])];
        d[0] = new Diák(token[1], "", "piros");
        String kit = token[2];
        for (int i = 1; i < d.length; i++) {
            token = sc.nextLine().split(";");
            d[i] = new Diák(token[0], token[1], "");
        }

        for (int i = 1; i < d.length; i++) {
            int k = i;
            while(k < d.length) {
                if (d[k].getElozo().equals(d[i-1].getNev())) {
                    if (d[i-1].getSapka().equals("piros"))
                        d[k].setSapka("kék");
                    else
                        d[k].setSapka("piros");

                    Diák tmp = d[i];
                    d[i] = d[k];
                    d[k] = tmp;
                    break;
                }
                k++;
            }
        }

        int piros = 0;
        int kék = 0;
        /* saját for, ehhez a színeket -1-ről kell indítani, és utána külön kiírni:
        for (int i = 0; i < d.length; i++) {
            if (d[i].getSapka().equals("piros"))
                piros++;
            else kék++;
        }*/

        for (int i = 0; i < d.length; i++) {
            if (d[i].getNev().equals(kit))
                System.out.println(piros + " " + kék);

            if (i%2 == 0)
                piros++;
            else
                kék++;
        }
    }
}