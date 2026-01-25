// BOJ_26209_Intercepting Information

import java.io.*;
import java.util.*;

public class BOJ_26209 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* ==========sol========== */
        boolean isSuccess = true;
        for (int i = 0; i < 8; i++) {
            if (Integer.parseInt(st.nextToken()) == 9) {
                isSuccess = false;
                break;
            }
        }

        /* ==========output========== */
        System.out.println(isSuccess ? "S" : "F");
        br.close();
    }
}
