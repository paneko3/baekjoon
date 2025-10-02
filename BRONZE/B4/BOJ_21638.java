// BOJ_21638_SMS from MCHS

import java.io.*;
import java.util.*;

public class BOJ_21638 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st1.nextToken());
        int v1 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st2.nextToken());
        int v2 = Integer.parseInt(st2.nextToken());

        /* ==========sol========== */
        String message = "No message";
        if (t2 < 0 && v2 >= 10) {
            message = "A storm warning for tomorrow! Be careful and stay home if possible!";
        } 
        else if (t2 < t1) {
            message = "MCHS warns! Low temperature is expected tomorrow.";
        } 
        else if (v2 > v1) {
            message = "MCHS warns! Strong wind is expected tomorrow.";
        }

        /* ==========output========== */
        System.out.println(message);
        br.close();
    }
}
