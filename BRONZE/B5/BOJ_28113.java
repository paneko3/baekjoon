// BOJ_28113_정보섬의 대중교통

import java.io.*;
import java.util.*;

public class BOJ_28113 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        String result = "";
        if (a < b) {
            result = "Bus";
        } else if (a > b) {
            result = "Subway";
        } else {
            result = "Anything";
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
