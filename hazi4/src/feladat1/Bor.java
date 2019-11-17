package feladat1;

public class Bor extends AlkoholosItal {
    private String szolofajta;
    private String termoTerulet;

    public Bor(String iz, double alkoholTartalom, String szolofajta, String termoTerulet) {
        super(iz, alkoholTartalom);
        this.szolofajta = szolofajta;
        this.termoTerulet = termoTerulet;
    }

    public String milyenSzolobolKeszult() {
        return szolofajta;
    }

    @Override
    public String mibolKeszult() {
        return null;
    }

    public String holTermett() {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" +
                "szolofajta='" + szolofajta + '\'' +
                ", termoTerulet='" + termoTerulet + '\'' +
                '}';
    }
}