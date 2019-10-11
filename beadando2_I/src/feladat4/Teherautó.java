package feladat4;

public class Teherautó extends Autó {
    private int maxSzállíthatóTeher;

    public Teherautó(String rendszám, int motorTeljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teherautó{" +
                "maxSzállíthatóTeher=" + maxSzállíthatóTeher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teherautó teherautó = (Teherautó) o;
        return maxSzállíthatóTeher == teherautó.maxSzállíthatóTeher;
    }
}
