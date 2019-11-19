package molekula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestM {
    public static void main(String[] args) throws IOException {
        String sor;
        String[] token;
        boolean elemek = true;
        HashMap<String, String> elemmap = new HashMap<>();
        HashMap<String, Map<String, String>> anyagok = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((sor = br.readLine()) != null) {
            if (sor.equals("-")) {
                elemek = false;
            }
            if (elemek) {
                token = sor.split(":");
                elemmap.put(token[0], token[1]);
            }
            if (!elemek) {
                token = sor.split(":|,}");
                for (int i = 0; i < token.length; i++) {

                }
            }
        }
    }
}