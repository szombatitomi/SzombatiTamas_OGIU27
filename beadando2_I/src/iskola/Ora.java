package iskola;

public class Ora {
    int kod;
    String nev;
    int kezdes;

    public Ora() {
    }

    public Ora(int kod, String nev, int kezdes) {
        this.kod = kod;
        this.nev = nev;
        if (kezdes < 8)
            this.kezdes = 8;
        else if (kezdes > 19)
            this.kezdes = 19;
        else this.kezdes = kezdes;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKezdes() {
        return kezdes;
    }

    public void setKezdes(int kezdes) {
        this.kezdes = kezdes;
    }

    @Override
    public String toString() {
        return "Név: " + nev + ", Kód: " + kod + ", Kezdés: " + kezdes;
    }
}