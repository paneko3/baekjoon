// BOJ_29699_Welcome to SMUPC!

import java.io.*;
import java.util.*;

public class BOJ_29699 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "WelcomeToSMUPC";
        
        /* ==========sol========== */
        char result = s.charAt((n - 1) % s.length());
        
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
