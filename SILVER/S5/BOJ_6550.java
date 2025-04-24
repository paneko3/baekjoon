// BOJ_6550_부분 문자열

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_6550 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String s = st.nextToken();
            String t = st.nextToken();

            /* ==========sol========== */
            int sIndex = 0, tIndex = 0;
            while (sIndex < s.length() && tIndex < t.length()) {
                if (s.charAt(sIndex) == t.charAt(tIndex)) {
                    sIndex++;
                }
                tIndex++;
            }

            /* ==========output========== */
            System.out.println(sIndex == s.length() ? "Yes" : "No");
        }
		br.close();
	}
}