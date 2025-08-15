// BOJ_9996_한국이 그리울 땐 서버에 접속하지

import java.io.*;
import java.util.*;

public class BOJ_9996 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        /* ==========sol========== */
        int starIndex = pattern.indexOf('*');
        String prefix = pattern.substring(0, starIndex);
        String suffix = pattern.substring(starIndex + 1);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String fileName = br.readLine();
            
            if (fileName.length() < prefix.length() + suffix.length()) {
                result.append("NE\n");
                continue;
            }

            if (fileName.startsWith(prefix) && fileName.endsWith(suffix)) {
                result.append("DA\n");
            } else {
                result.append("NE\n");
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
