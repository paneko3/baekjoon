// BOJ_31495_그게 무슨 코드니..

import java.io.*;

public class BOJ_31495 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        /* ==========sol========== */
        int N = S.length();
        
        if (N < 2) {
            System.out.println("CE");
            return;
        }

        if (S.charAt(0) == '"' && S.charAt(N - 1) == '"') {
            String innerString = S.substring(1, N - 1);
            
            if (innerString.isEmpty()) {
                System.out.println("CE");
            } else {
                System.out.println(innerString);
            }
        } else {
            System.out.println("CE");
        }
        
        /* ==========output========== */
        br.close();
    }
}
