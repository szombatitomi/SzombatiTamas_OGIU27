package ital;

public class SzeszesItal extends Ital {
    private double alkoholTartalom;

    public SzeszesItal(String név, String kiszerelés, int ár, double alkoholTartalom) {
        super(név, kiszerelés, ár);
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
        this.alkoholTartalom = alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return getAlkoholTartalom() + "% alkoholtartalmú " + super.toString();
    }
}