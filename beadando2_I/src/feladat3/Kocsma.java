package feladat3;

import java.util.Arrays;

public class Kocsma extends VendéglátóipariEgység {
    private String[] sörlap;

    public Kocsma(String név, int férőhelyekSzáma, boolean dohányzó, String[] sörlap) {
        super(név, férőhelyekSzáma, dohányzó);
        this.setDohányzó(true);
        this.sörlap = sörlap;
    }

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" +
                "sörlap=" + Arrays.toString(sörlap) +
                '}';
    }
}
