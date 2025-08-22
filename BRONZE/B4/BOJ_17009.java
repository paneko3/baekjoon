// BOJ_17009_Winning Score

import java.io.*;
import java.util.*;

public class BOJ_17009 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int apple3 = Integer.parseInt(br.readLine());
        int apple2 = Integer.parseInt(br.readLine());
        int apple1 = Integer.parseInt(br.readLine());
        
        int banana3 = Integer.parseInt(br.readLine());
        int banana2 = Integer.parseInt(br.readLine());
        int banana1 = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int appleScore = apple3 * 3 + apple2 * 2 + apple1 * 1;
        int bananaScore = banana3 * 3 + banana2 * 2 + banana1 * 1;
        String result;
        
        if (appleScore > bananaScore) {
            result = "A";
        } else if (bananaScore > appleScore) {
            result = "B";
        } else {
            result = "T";
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
