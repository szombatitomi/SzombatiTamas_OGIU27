package feladat3;

import java.util.Arrays;

public class Étterem extends VendéglátóipariEgység {
    private String[] étlap;

    public Étterem(String név, int férőhelyekSzáma, boolean dohányzó, String[] étlap) {
        super(név, férőhelyekSzáma, dohányzó);
        this.setDohányzó(false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return "Étterem{" +
                "étlap=" + Arrays.toString(étlap) +
                '}';
    }
}
