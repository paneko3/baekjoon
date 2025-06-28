// BOJ_11568_민균이의계략

import java.io.*;
import java.util.*;

public class BOJ_11568 {
    static int lowerBound(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        ArrayList<Integer> dp = new ArrayList<>();
        for (int x : arr) {
            int idx = lowerBound(dp, x);
            if (idx == dp.size()) {
                dp.add(x);
            } else {
                dp.set(idx, x);
            }
        }

        /* ==========output========== */
        System.out.println(dp.size());
    }
}
