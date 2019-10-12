package feladat6_masfelmillio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Lepes implements Comparable<Lepes> {
    String nev;
    int kek;
    int piros;
    int sarga;
    int zold;

    public Lepes(String nev, int kek, int piros, int sarga, int zold) {
        this.nev = nev;
        this.kek = kek;
        this.piros = piros;
        this.sarga = sarga;
        this.zold = zold;
    }

    @Override
    public String toString() {
        return nev;
    }

    @Override
    public int compareTo(Lepes lepes) {
        if (lepes.kek != this.kek)
            return lepes.kek-this.kek;
        if (lepes.piros != this.piros)
            return lepes.piros-this.piros;
        if (lepes.sarga != this.sarga)
            return lepes.sarga-this.sarga;
        if (lepes.zold != this.zold)
            return lepes.zold-this.zold;

        return this.nev.compareTo(lepes.nev);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nev, sor;
        String[] token;
        int kek, piros, sarga, zold, n = 0;
        n = Integer.parseInt(sc.nextLine());
        List<Lepes> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            kek = 0;
            piros = 0;
            sarga = 0;
            zold = 0;
            sor = sc.nextLine();
            token = sor.split(";");
            for (int j = 0; j < token[1].length(); j++) {
                if (token[1].charAt(j) == 'K')
                    kek++;
                if (token[1].charAt(j) == 'P')
                    piros++;
                if (token[1].charAt(j) == 'S')
                    sarga++;
                if (token[1].charAt(j) == 'Z')
                    zold++;
            }
            lista.add(new Lepes(token[0], kek, piros, sarga, zold));
        }

        Collections.sort(lista);

        for (Lepes j : lista) {
            System.out.println(j);
        }
    }
}