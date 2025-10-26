// BOJ_27960_사격 내기

import java.io.*;
import java.util.*;

public class BOJ_27960 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int SA = Integer.parseInt(st.nextToken());
        int SB = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        
        int SC = SA ^ SB;

        /* ==========output========== */
        System.out.println(SC);
        br.close();
    }
}
