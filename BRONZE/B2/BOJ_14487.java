// BOJ_14487_욱제는 효도쟁이야!!
import java.io.*;
import java.util.*;

public class BOJ_14487 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* ==========sol========== */
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            sum += v;
            if (v > max) max = v;
        }

        /* ==========output========== */
        System.out.println(sum - max);
    }
}
