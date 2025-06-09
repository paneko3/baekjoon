// BOJ_17363_우유가_넘어지면

import java.io.*;

public class BOJ_17363 {
    static int N, M;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        /* ==========sol========== */
        char[][] result = new char[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[M - j - 1][i] = rotate(map[i][j]);
            }
        }

        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(result[i]).append('\n');
        }
        System.out.print(sb);
    }

    static char rotate(char c) {
        if (c == '-') return '|';
        if (c == '|') return '-';
        if (c == '/') return '\\';
        if (c == '\\') return '/';
        if (c == '^') return '<';
        if (c == '<') return 'v';
        if (c == 'v') return '>';
        if (c == '>') return '^';
        return c;
    }
}
