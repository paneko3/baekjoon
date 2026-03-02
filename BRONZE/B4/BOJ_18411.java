// BOJ_18411_試験 (Exam)

import java.io.*;
import java.util.*;

public class BOJ_18411 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) { arr[i] = Integer.parseInt(st.nextToken()); }
        /* ==========sol========== */
        Arrays.sort(arr);
        int result = arr[1] + arr[2];
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
