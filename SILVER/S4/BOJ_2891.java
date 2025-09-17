// BOJ_2891_카약과 강풍

import java.io.*;
import java.util.*;

public class BOJ_2891 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        int[] teams = new int[N + 1];
        Arrays.fill(teams, 0);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++) {
            teams[Integer.parseInt(st.nextToken())]--;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            teams[Integer.parseInt(st.nextToken())]++;
        }

        /* ==========sol========== */
        for (int i = 1; i <= N; i++) {
            if (teams[i] == -1) {
                if (i > 1 && teams[i - 1] == 1) {
                    teams[i - 1] = 0;
                    teams[i] = 0;
                } else if (i < N && teams[i + 1] == 1) {
                    teams[i + 1] = 0;
                    teams[i] = 0;
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (teams[i] == -1) {
                result++;
            }
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
