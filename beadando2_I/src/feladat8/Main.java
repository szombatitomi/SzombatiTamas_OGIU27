package feladat8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String sajat = "", gep = "";

        while (true) {
            while (!((sajat.equals("kő")) || (sajat.equals("papír")) || (sajat.equals("olló")) || (sajat.equals("vége")))) {
                sajat = sc.nextLine();
            }
            if (sajat.equals("vége")) {
                break;
            }
            switch(rand.nextInt(3)) { //between 0 and n-1
                case 0:
                    gep = "kő";
                    break;
                case 1:
                    gep = "papír";
                    break;
                case 2:
                    gep = "olló";
                    break;
            }
            System.out.println("Játékos: " + sajat);
            System.out.println("Gép: " + gep);
            if (sajat.equals(gep)) {
                System.out.println("Döntetlen");
            } else if ((sajat.equals("kő") && gep.equals("olló")) || (sajat.equals("papír") && gep.equals("kő"))
                    || (sajat.equals("olló") && gep.equals("papír")))
                System.out.println("Játékos nyert!");
            else System.out.println("Gép nyert!");
            sajat = sc.nextLine();
        }
    }
}