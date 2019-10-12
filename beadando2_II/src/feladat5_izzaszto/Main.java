package feladat5_izzaszto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Izzaszto implements Comparable<Izzaszto> {
    String nev;
    int fok;

    public Izzaszto(String nev, int fok) {
        this.nev = nev;
        this.fok = fok;
    }

    @Override
    public String toString() {
        return nev + " (" + fok + ")";
    }

    @Override
    public int compareTo(Izzaszto izzaszto) {
        if (izzaszto.fok != this.fok)
            return izzaszto.fok-this.fok;
        return this.nev.compareTo(izzaszto.nev);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor, ref;
        int n, fok;
        sor = sc.nextLine();
        String[] token = sor.split(" ");
        n = Integer.parseInt(token[0]);
        ref = token[1];
        List<Izzaszto> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            token = sor.split(":");
            lista.add(new Izzaszto(token[0], Integer.parseInt(token[1])));
        }

        Collections.sort(lista);
        int refhofok = 0;
        for (Izzaszto j : lista) {
            if (j.nev.equals(ref))
                refhofok = j.fok;
        }
        for (Izzaszto j : lista) {
            if (j.fok > refhofok)
                System.out.println(j);
        }
    }
}