// BOJ_30501_관공... 어찌하여 목만 오셨소...

import java.io.*;

public class BOJ_30501 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = "";

        /* ==========sol========== */
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (name.contains("S")) {
                result = name;
            }
        }

        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}