// BOJ_17615_볼 모으기

import java.io.*;

public class BOJ_17615 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        /* ==========sol========== */
        int rLeft = 0, rRight = 0, bLeft = 0, bRight = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                rLeft++;
            } else {
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'R') {
                rRight++;
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'B') {
                bLeft++;
            } else {
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'B') {
                bRight++;
            } else {
                break;
            }
        }
        int rTotal = 0, bTotal = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                rTotal++;
            } else {
                bTotal++;
            }
        }
        int result = Math.min(rTotal - rLeft, Math.min(rTotal - rRight, Math.min(bTotal - bLeft, bTotal - bRight)));
        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}