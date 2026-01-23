// BOJ_1515_수 이어 쓰기

import java.io.*;

public class BOJ_1515 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        /* ==========sol========== */
        int n = 0;
        int pointer = 0;

        while (pointer < s.length()) {
            n++;
            String currentStr = String.valueOf(n);
            
            for (int i = 0; i < currentStr.length(); i++) {
                if (currentStr.charAt(i) == s.charAt(pointer)) {
                    pointer++;
                    if (pointer == s.length()) break;
                }
            }
        }

        /* ==========output========== */
        System.out.println(n);
        br.close();
    }
}
