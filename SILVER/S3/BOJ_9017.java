// BOJ_9017_크로스 컨트리

import java.io.*;
import java.util.*;

public class BOJ_9017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            int[] input = new int[N];
            int[] teamSize = new int[201];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) { 
                input[i] = Integer.parseInt(st.nextToken());
                teamSize[input[i]]++;
            }
            /* ==========sol========== */
            int[] teamScore = new int[201];
            int[] memberCount = new int[201];
            int[] fifthRank = new int[201];
            int currentPoint = 1;
            for (int i = 0; i < N; i++) {
                int teamId = input[i];
                if (teamSize[teamId] == 6) {
                    memberCount[teamId]++;
                    if (memberCount[teamId] <= 4) { teamScore[teamId] += currentPoint; }
                    if (memberCount[teamId] == 5) { fifthRank[teamId] = currentPoint; }
                    currentPoint++;
                }
            }
            int winner = 0, minScore = Integer.MAX_VALUE, minFifth = Integer.MAX_VALUE;
            for (int i = 1; i <= 200; i++) {
                if (teamSize[i] == 6) {
                    if (teamScore[i] < minScore) {
                        winner = i; minScore = teamScore[i]; minFifth = fifthRank[i];
                    } else if (teamScore[i] == minScore && fifthRank[i] < minFifth) {
                        winner = i; minFifth = fifthRank[i];
                    }
                }
            }
            /* ==========output========== */
            System.out.println(winner);
        }
        br.close();
    }
}
