// BOJ_23808_골뱅이 찍기 - ㅂ

import java.io.*;
import java.util.*;

public class BOJ_23808 {
    StringBuilder sb = new StringBuilder();

    private void printSplitShells(int n) {
        for (int j = 0; j < n; j++) sb.append('@');
        for (int j = 0; j < n * 3; j++) sb.append(' ');
        for (int j = 0; j < n; j++) sb.append('@');
        sb.append('\n');
    }

    private void printFullShells(int n) {
        for (int j = 0; j < n * 5; j++) sb.append('@');
        sb.append('\n');
    }

    private void solution() throws Exception {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        /* ==========sol========== */
        for (int i = 0; i < n * 2; i++) printSplitShells(n);
        for (int i = 0; i < n; i++) printFullShells(n);
        for (int i = 0; i < n; i++) printSplitShells(n);
        for (int i = 0; i < n; i++) printFullShells(n);
        
        /* ==========output========== */
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
