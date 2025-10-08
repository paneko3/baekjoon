// BOJ_10166_관중석

import java.io.*;
import java.util.*;

public class BOJ_10166 {
    static int euclid(int a, int b) {
        while (b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int D1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());

        int result = 0;

        boolean map[][] = new boolean[D2 + 1][D2 + 1];

        for (int i = D1; i < D2 + 1; i++) {

            for (int j = 1; j <= i; j++) {
                int gcd = euclid(i, j);
                int a = (int) j / gcd;
                int b = (int) i / gcd;
                if (!map[a][b]) {
                    map[a][b] = true;
                    result++;
                }
            }
        }

        bw.write(result + "\n");

        br.close();
        bw.close();
    }
}
