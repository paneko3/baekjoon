// BOJ_27219_Робинзон Крузо

import java.io.*;
import java.util.*;

public class BOJ_27219 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n / 5; i++) { result.append("V"); }
        for (int i = 0; i < n % 5; i++) { result.append("I"); }
        /* ==========output========== */
        System.out.println(result.toString());
        br.close();
    }
}
