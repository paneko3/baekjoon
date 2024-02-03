// BOJ_14405_피카츄

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14405 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        str = str.replaceAll("pi","");
        str = str.replaceAll("ka","");
        str = str.replaceAll("chu","");
        /* ==========output========== */
        System.out.println(str.equals("")?"YES":"NO");
        br.close();
    }
}