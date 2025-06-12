// BOJ_5026_박사_과정

import java.io.*;

public class BOJ_5026 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol + output========== */
        while (N-- > 0) {
            String s = br.readLine();
            if (s.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String[] parts = s.split("\\+");
                System.out.println(Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]));
            }
        }
    }
}
