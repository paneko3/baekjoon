// BOJ_34052_체육은 수학과목 입니다 2

import java.util.Scanner;

public class BOJ_34052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int totalTime = 0;
        for (int i = 0; i < 4; i++) {
            totalTime += sc.nextInt();
        }

        /* ==========sol========== */
        totalTime += 300;
        String result = (totalTime <= 1800) ? "Yes" : "No";

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
