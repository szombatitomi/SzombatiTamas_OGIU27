package feladat2_fejesek;

public class Diák {
    String nev;
    String elozo;
    String sapka;

    public Diák(String nev, String elozo, String sapka) {
        this.nev = nev;
        this.elozo = elozo;
        this.sapka = sapka;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getElozo() {
        return elozo;
    }

    public void setElozo(String elozo) {
        this.elozo = elozo;
    }

    public String getSapka() {
        return sapka;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

    @Override
    public String toString() {
        return "Diák {" +
                "nev='" + nev + '\'' +
                ", elozo='" + elozo + '\'' +
                ", sapka='" + sapka + '\'' +
                '}';
    }
}