package feladat1;

public class Aszu extends Bor {
    private int puttonySzam;

    public Aszu(String iz, double alkoholTartalom, String szolofajta, String termoTerulet, int puttonySzam) {
        super(iz, alkoholTartalom, szolofajta, termoTerulet);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszú: " + super.milyenIzu() + " ízű, " + super.mennyiAlkoholtTartalmaz() + "% alkoholtartalmú, " +
                super.milyenSzolobolKeszult() + " szőlőből készült, termőterület: " + super.holTermett() + ", " +
                puttonySzam + " puttonyos.";
    }
}