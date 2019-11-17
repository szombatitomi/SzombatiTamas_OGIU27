package ital;

import java.util.Objects;

public class Ital implements Comparable<Ital> {
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + " Ft";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ital ital = (Ital) o;
        return Objects.equals(név, ital.név) &&
                Objects.equals(kiszerelés, ital.kiszerelés);
    }

    @Override
    public int compareTo(Ital ital) {
        return 0;
    }
}