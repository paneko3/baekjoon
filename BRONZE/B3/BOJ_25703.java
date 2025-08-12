// BOJ_25703_포인터 공부

import java.io.*;
import java.util.*;

public class BOJ_25703 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        result.append("int a;\n");
        if (n >= 1) {
            result.append("int *ptr = &a;\n");
        }
        for (int i = 2; i <= n; i++) {
            result.append("int ");
            for (int j = 0; j < i; j++) {
                result.append("*");
            }
            result.append("ptr").append(i).append(" = &");
            if (i == 2) {
                result.append("ptr");
            } else {
                result.append("ptr").append(i - 1);
            }
            result.append(";\n");
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
