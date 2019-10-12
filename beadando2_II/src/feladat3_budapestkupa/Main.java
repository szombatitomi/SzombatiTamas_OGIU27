package feladat3_budapestkupa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Tura implements Comparable<Tura> {
    int ev;
    int ho;
    int nap;
    String nev;
    int hossz;

    public Tura(int ev, int ho, int nap, String nev, int hossz) {
        this.ev = ev;
        this.ho = ho;
        this.nap = nap;
        this.nev = nev;
        this.hossz = hossz;
    }

    @Override
    public String toString() {
        return ev + ";" + ho + ";" + nap + ";" + nev;
    }

    @Override
    public int compareTo(Tura tura) {
        if (this.ev == tura.ev && this.ho == tura.ho && this.nap != tura.nap)
            return this.nap-tura.nap;
        if (this.ev == tura.ev && this.ho != tura.ho)
            return this.ho-tura.ho;
        if (this.ev != tura.ev)
            return this.ev-tura.ev;


        return this.nev.compareTo(tura.nev);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ev, ho, nap, hossz = 0, max = 0;
        String sor, nev;
        String[] token;
        n = Integer.parseInt(sc.nextLine());
        List<Tura> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hossz = 0;
            sor = sc.nextLine();
            token = sor.split(";");
            ev = Integer.parseInt(token[0]);
            ho = Integer.parseInt(token[1]);
            nap = Integer.parseInt(token[2]);
            nev = token[3];
            for (int j = 4; j < token.length; j++) {
                hossz += Integer.parseInt(token[j]);
            }
            lista.add(new Tura(ev, ho, nap, nev, hossz));
            if (hossz > max)
                max = hossz;
        }

        Collections.sort(lista);

        for (Tura j : lista) {
            if (j.hossz == max)
                System.out.println(j);
        }
    }
}