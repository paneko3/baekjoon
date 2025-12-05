// BOJ_16199_나이 계산하기

import java.io.*;
import java.util.*;

public class BOJ_16199 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int y2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int man = y2 - y1;
        if (m1 > m2 || (m1 == m2 && d1 > d2)) {
            man--;
        }
        int count = y2 - y1 + 1;
        int year = y2 - y1;
        /* ==========output========== */
        System.out.println(man);
        System.out.println(count);
        System.out.println(year);
        br.close();
    }
}
