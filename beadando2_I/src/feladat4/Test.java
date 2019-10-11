package feladat4;

import java.util.Arrays;

public class Test {
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher) {
        for (int i = 0; i < teher.length; i++) {
            for (int j = i+1; j < teher.length; j++) {
                if (teher[j].getMaxSzállíthatóTeher() > teher[i].getMaxSzállíthatóTeher()) {
                    Teherautó tmp;
                    tmp = teher[j];
                    teher[j] = teher[i];
                    teher[i] = tmp;
                }
            }
        }
    }

    public static Autó[] keresMaxMotorTeljesítmény(Autó[] auto) {
        Autó[] visszaad = new Autó[1];
        int max = 0;
        for (int i = 0; i < auto.length; i++) {
            if (auto[i].getMotorTeljesítmény() > max) {
                max = auto[i].getMotorTeljesítmény();
                visszaad[0] = auto[i];
            }
        }
        return visszaad;
    }

    public static void main(String[] args) {
        Autó[] tomb = new Autó[10];
        Teherautó[] tehertomb = new Teherautó[10];

        tomb[0] = new Autó("ABC123", 50);
        tomb[1] = new Autó("STS333", 38);
        tomb[2] = new Autó("CSC879", 72);
        tomb[3] = new Autó("DFE342", 92);
        tomb[4] = new Autó("NFT967", 105);
        tomb[5] = new Teherautó("XMN853", 130, 3500);
        tomb[6] = new Teherautó("YHG974", 105, 7500);
        tomb[7] = new Teherautó("RTZ153", 176, 20000);
        tomb[8] = new Teherautó("RLK263", 180, 1470);
        tomb[9] = new Teherautó("CBE673", 167, 40000);

        tehertomb[0] = new Teherautó("ABC123", 50, 1750);
        tehertomb[1] = new Teherautó("STS333", 38, 1500);
        tehertomb[2] = new Teherautó("CSC879", 72, 2780);
        tehertomb[3] = new Teherautó("DFE342", 92, 2950);
        tehertomb[4] = new Teherautó("NFT967", 105, 3700);
        tehertomb[5] = new Teherautó("XMN853", 130, 3500);
        tehertomb[6] = new Teherautó("YHG974", 105, 7500);
        tehertomb[7] = new Teherautó("RTZ153", 176, 20000);
        tehertomb[8] = new Teherautó("RLK263", 180, 1470);
        tehertomb[9] = new Teherautó("CBE673", 167, 40000);

        rendezMaxSzállíthatóTeherCsökkenőleg(tehertomb);
        System.out.println(Arrays.toString(tehertomb));

        Autó[] au = keresMaxMotorTeljesítmény(tomb);
        System.out.println(Arrays.toString(au));
    }
}