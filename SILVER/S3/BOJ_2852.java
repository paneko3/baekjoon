// BOJ_2852_NBA 농구

import java.io.*;
import java.util.*;

public class BOJ_2852 {

    private static int timeToSeconds(String tStr) {
        String[] parts = tStr.split(":");
        int M = Integer.parseInt(parts[0]);
        int S = Integer.parseInt(parts[1]);
        return M * 60 + S;
    }

    private static String secondsToTime(int totalSeconds) {
        int M = totalSeconds / 60;
        int S = totalSeconds % 60;
        return String.format("%02d:%02d", M, S);
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<int[]> scores = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int team = Integer.parseInt(st.nextToken());
            int time = timeToSeconds(st.nextToken());
            scores.add(new int[]{team, time});
        }

        /* ==========sol========== */
        final int TOTAL_TIME = 48 * 60;
        
        int[] winTime = new int[3];
        int score1 = 0;
        int score2 = 0;
        int prevTime = 0;
        
        for (int[] score : scores) {
            int currentTeam = score[0];
            int currentTime = score[1];

            if (score1 > score2) {
                winTime[1] += (currentTime - prevTime);
            } else if (score2 > score1) {
                winTime[2] += (currentTime - prevTime);
            }
            
            if (currentTeam == 1) {
                score1++;
            } else {
                score2++;
            }
            
            prevTime = currentTime;
        }
        
        if (score1 > score2) {
            winTime[1] += (TOTAL_TIME - prevTime);
        } else if (score2 > score1) {
            winTime[2] += (TOTAL_TIME - prevTime);
        }
        
        String result1 = secondsToTime(winTime[1]);
        String result2 = secondsToTime(winTime[2]);

        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}
