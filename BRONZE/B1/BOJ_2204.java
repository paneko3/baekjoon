// BOJ_2204_도비의 난독증 테스트

import java.io.*;

public class BOJ_2204 {
	public static void main(String[] args) throws IOException {
		 /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String answer = br.readLine();
            String minLower = answer.toLowerCase();

            /* ==========sol========== */
            for (int i = 1; i < n; i++) {
                String word = br.readLine();
                String lower = word.toLowerCase();

                if (lower.compareTo(minLower) < 0) {
                    minLower = lower;
                    answer = word;
                }
            }

            /* ==========output========== */
            System.out.println(answer);
        }
		br.close();
	}
}