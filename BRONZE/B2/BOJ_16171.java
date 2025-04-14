// BOJ_16171_나는 친구가 적다 (Small)

import java.io.*;

public class BOJ_16171 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine(); 
        String K = br.readLine(); 
        /* ==========sol========== */
        String filtered = S.replaceAll("[0-9]", "");
        int result = filtered.contains(K) ? 1 : 0;
        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}