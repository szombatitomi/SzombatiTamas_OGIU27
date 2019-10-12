package feladat1;

import java.util.Objects;

public class Nyilas extends Katona {
    private int lőtáv;

    public int getLőtáv() {
        return lőtáv+super.getTamado();
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    public Nyilas(int tamado, int vedo, int lőtáv) {
        super(tamado, vedo);
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + getTamado() + ", VE: " + getVedo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nyilas nyilas = (Nyilas) o;
        return lőtáv == nyilas.lőtáv;
    }
}