// BOJ_25191_치킨댄스를 추는 곰곰이를 본 임스

import java.io.*;
import java.util.*;

public class BOJ_25191 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int possible = (a / 2) + b;
        int result = Math.min(n, possible);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
