package feladat1;

public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos {
    private double alkoholTartalom;

    public ErjedtGyumolcs(String fajta, String iz, double alkoholTartalom) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return 0;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" +
                "alkoholTartalom=" + alkoholTartalom +
                '}';
    }
}
