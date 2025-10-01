// BOJ_25915_연세여 사랑한다

import java.io.*;
import java.util.*;

public class BOJ_25915 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char startChar = br.readLine().charAt(0);

        /* ==========sol========== */
        String password = "ILOVEYONSEI";
        int totalDistance = 0;
        char currentChar = startChar;

        for (int i = 0; i < password.length(); i++) {
            char nextChar = password.charAt(i);
            int distance = Math.abs(nextChar - currentChar);
            totalDistance += distance;
            currentChar = nextChar;
        }

        /* ==========output========== */
        System.out.println(totalDistance);
        br.close();
    }
}
