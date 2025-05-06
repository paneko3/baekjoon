// BOJ_21756_지우개

import java.io.*;

public class BOJ_21756 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int power = 1;
        while (power * 2 <= N) {
            power *= 2;
        }

        /* ==========output========== */
        System.out.println(power);
		br.close();
	}
}