// BOJ_23968_알고리즘 수업 - 버블 정렬 1
import java.io.*;
import java.util.*;

public class BOJ_23968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* ==========input========== */
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        int count = 0;
        int res1 = -1, res2 = -1;
        boolean found = false;

        for (int last = n; last >= 2; last--) {
            for (int i = 0; i < last - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;

                    if (count == k) {
                        res1 = a[i];
                        res2 = a[i + 1];
                        found = true;
                        break;
                    }
                }
            }
            if (found) break;
        }

        /* ==========output========== */
        if (found) {
            System.out.println(res1 + " " + res2);
        } else {
            System.out.println("-1");
        }
        br.close();
    }
}
