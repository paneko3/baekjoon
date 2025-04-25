// BOJ_24079_移動 (Moving)

import java.io.*;

public class BOJ_24079 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int total = x + y;
        int limit = z * 60 + 30;

        /* ==========output========== */
        System.out.println(total * 60 <= limit ? 1 : 0);
		br.close();
	}
}