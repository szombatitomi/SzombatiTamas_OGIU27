package feladat6;

public class Main {
    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4)
            return false;
        int hossz = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i-1]) {
                hossz++;
                if (hossz >= 4)
                    return true;
            }
            else hossz = 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isConsecutiveFour(tomb));

        int[] tomb2 = {1, 2, 3, 3, 3, 3, 7, 8, 9, 10};
        System.out.println(isConsecutiveFour(tomb2));
    }
}
