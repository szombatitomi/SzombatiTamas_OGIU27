package feladat4_hullamvasutak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Vasut implements Comparable<Vasut> {
    String nev;
    String vilag;
    int magassag;
    int ido;

    public Vasut(String nev, String vilag, int magassag, int ido) {
        this.nev = nev;
        this.vilag = vilag;
        this.magassag = magassag;
        this.ido = ido;
    }

    @Override
    public int compareTo(Vasut o) {
        int kul = this.ido-o.ido;
        if (kul != 0)
            return kul;
        else {
            if (o.magassag-this.magassag != 0)
                return o.magassag-this.magassag;
            else return this.nev.compareTo(o.nev);
        }
    }

    @Override
    public String toString() {
        return nev + " (" + vilag + "): " + ido;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor, nev, vilag;
        String[] token;
        int magassag, ido, n;
        List<Vasut> lista = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sor = br.readLine();
            token = sor.split(";");
            nev = token[0];
            vilag = token[1];
            magassag = Integer.parseInt(token[2]);
            ido = Integer.parseInt(token[3]);
            lista.add(new Vasut(nev, vilag, magassag, ido));
        }

        Collections.sort(lista);

        for (Vasut j :
                lista) {
            System.out.println(j);
        }
    }
}