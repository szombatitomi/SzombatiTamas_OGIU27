package feladat4;

import java.util.Date;
import java.util.Objects;

public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Autó{" +
                "rendszám='" + rendszám + '\'' +
                ", motorTeljesítmény=" + motorTeljesítmény +
                ", gyártásDátuma=" + gyártásDátuma +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autó autó = (Autó) o;
        return motorTeljesítmény == autó.motorTeljesítmény &&
                Objects.equals(rendszám, autó.rendszám) &&
                Objects.equals(gyártásDátuma, autó.gyártásDátuma);
    }
}