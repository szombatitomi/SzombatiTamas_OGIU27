package ital;

import java.util.Date;

public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár = 10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + " Ft";
    }

    public boolean equals(Ital o) {
        if (o.név == this.név && o.kiszerelés == this.kiszerelés && ár == getÁr())
            return true;
        else return false;
    }

    public static double getÁrEuróban(int ár) {
        return ár/333.0;
    }
}