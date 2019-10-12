package feladat1;

public class Katona {
    private int tamado;
    private int vedo;

    public int getTamado() {
        return tamado;
    }

    public void setTamado(int tamado) {
        this.tamado = tamado;
    }

    public int getVedo() {
        return vedo;
    }

    public void setVedo(int vedo) {
        this.vedo = vedo;
    }

    public Katona(int tamado, int vedo) {
        this.tamado = tamado;
        this.vedo = vedo;
    }

    public Katona() {
        this.tamado = 5;
        this.vedo = 5;
    }

    @Override
    public String toString() {
        return "Lándzsás: TE: " + tamado + ", VE: " + vedo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Katona katona = (Katona) o;
        return tamado == katona.tamado &&
                vedo == katona.vedo;
    }
}