// BOJ_28097_모범생 포닉스

import java.io.*;
import java.util.*;

public class BOJ_28097 {
	public static void main(String[] args) throws IOException {
		// ==========input==========
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalTime = 0;

        // ==========sol==========
        for (int i = 0; i < N; i++) {
            int studyTime = Integer.parseInt(st.nextToken());
            totalTime += studyTime;
            if (i < N - 1) {
                totalTime += 8; // 마지막 계획 사이에는 휴식 X
            }
        }

        int days = totalTime / 24;
        int hours = totalTime % 24;

        // ==========output==========
        System.out.println(days + " " + hours);
		br.close();
	}
}