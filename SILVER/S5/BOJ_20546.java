// BOJ_20546_기적의_매매법

import java.io.*;
import java.util.*;

public class BOJ_20546 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[14];
        for (int i = 0; i < 14; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        int cashJ = N, stockJ = 0;
        int cashS = N, stockS = 0;
        for (int i = 0; i < 14; i++) {
            // BNP (준현)
            if (cashJ >= arr[i]) {
                int buy = cashJ / arr[i];
                stockJ += buy;
                cashJ -= buy * arr[i];
            }

            // TIMING (성민)
            if (i >= 3) {
                boolean up = arr[i - 3] < arr[i - 2] && arr[i - 2] < arr[i - 1];
                boolean down = arr[i - 3] > arr[i - 2] && arr[i - 2] > arr[i - 1];
                if (up && stockS > 0) {
                    cashS += stockS * arr[i];
                    stockS = 0;
                } else if (down && cashS >= arr[i]) {
                    int buy = cashS / arr[i];
                    stockS += buy;
                    cashS -= buy * arr[i];
                }
            }
        }

        int resultJ = cashJ + stockJ * arr[13];
        int resultS = cashS + stockS * arr[13];

        /* ==========output========== */
        if (resultJ > resultS) {
            System.out.println("BNP");
        } else if (resultJ < resultS) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
