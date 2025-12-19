// BOJ_24086_身長 (Height)

import java.io.*;
import java.util.*;

public class BOJ_24086 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = b - a;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
