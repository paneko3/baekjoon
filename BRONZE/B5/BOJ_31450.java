// BOJ_31450_Everyone is a winner

import java.io.*;
import java.util.*;

public class BOJ_31450 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        String result = "No";
        if (m % k == 0) { result = "Yes"; }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
