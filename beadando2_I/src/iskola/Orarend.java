package iskola;

import java.util.Arrays;

public class Orarend extends Ora {
    String nap;
    Ora[] ora;
    int counter;

    public Orarend(int kod, String nev, int kezdes) {
        super(kod, nev,kezdes);
    }

    public Orarend() {
    }

    public Orarend(String nap) {
        this.nap = nap;
        this.counter = 0;
        this.ora = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOra() {
        return ora;
    }

    public void setOra(Ora[] ora) {
        this.ora = ora;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Orarend{" +
                "nap='" + nap + '\'' +
                ", ora=" + Arrays.toString(ora) +
                ", counter=" + counter +
                '}';
    }
}