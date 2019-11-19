package karacsonyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Karácsonyi implements Comparable<Karácsonyi> {
    private String hozzávaló;
    private int mennyiség;

    public Karácsonyi(String hozzávaló, int mennyiség) {
        this.hozzávaló = hozzávaló;
        this.mennyiség = mennyiség;
    }

    public String getHozzávaló() {
        return hozzávaló;
    }

    public void setHozzávaló(String hozzávaló) {
        this.hozzávaló = hozzávaló;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    @Override
    public int compareTo(Karácsonyi karácsonyi) {
        if (this.mennyiség != karácsonyi.mennyiség)
            return karácsonyi.mennyiség - this.mennyiség;

        return this.hozzávaló.compareTo(karácsonyi.hozzávaló);
    }

    @Override
    public String toString() {
        return hozzávaló + ";" + mennyiség;
    }
}

public class Test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        String[] token;
        List<Karácsonyi> lista = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        while ((sor = br.readLine()) != null) {
            token = sor.split(";");
            if (!map.containsKey(token[0])) {
                map.put(token[0], Integer.parseInt(token[1]));
            }
            else {
                map.put(token[0], map.get(token[0])+Integer.parseInt(token[1]));
            }
        }
        for (Map.Entry j : map.entrySet()) {
            lista.add(new Karácsonyi(j.getKey().toString(),
                    Integer.parseInt(j.getValue().toString())));
        }

        Collections.sort(lista);

        for (Karácsonyi j : lista)
            System.out.println(j);
    }
}