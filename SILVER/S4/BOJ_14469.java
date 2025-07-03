// BOJ_14469_소가_길을_건너간_이유_3

import java.util.*;

public class BOJ_14469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] cows = new int[N][2];

        for (int i = 0; i < N; i++) {
            cows[i][0] = sc.nextInt(); // 도착 시간
            cows[i][1] = sc.nextInt(); // 검문 시간
        }

        Arrays.sort(cows, (a, b) -> a[0] - b[0]); // 도착 시간 기준 정렬

        int currentTime = 0;
        for (int i = 0; i < N; i++) {
            currentTime = Math.max(currentTime, cows[i][0]) + cows[i][1];
        }

        System.out.println(currentTime);
    }
}
