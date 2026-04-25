// BOJ_14627_파닭파닭
import java.io.*;
import java.util.*;

public class BOJ_14627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        /* ==========input========== */
        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] onions = new int[s];
        long totalSum = 0;
        int maxLen = 0;

        for (int i = 0; i < s; i++) {
            onions[i] = Integer.parseInt(br.readLine());
            totalSum += onions[i];
            maxLen = Math.max(maxLen, onions[i]);
        }

        /* ==========sol========== */
        long low = 1;
        long high = maxLen;
        long bestLen = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0;

            for (int onion : onions) {
                count += (onion / mid);
            }

            if (count >= c) {
                bestLen = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        /* ==========output========== */
        System.out.println(totalSum - (long)bestLen * c);
        br.close();
    }
}
