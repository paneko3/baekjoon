// BOJ_17249_태보태보 총난타

import java.util.Scanner;

public class BOJ_17249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        String s = sc.next();

        /* ==========sol========== */
        int faceIdx = s.indexOf("(^0^)");
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < faceIdx; i++) {
            if (s.charAt(i) == '@') {
                leftCount++;
            }
        }

        for (int i = faceIdx + 5; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                rightCount++;
            }
        }

        /* ==========output========== */
        System.out.println(leftCount + " " + rightCount);
        sc.close();
    }
}
