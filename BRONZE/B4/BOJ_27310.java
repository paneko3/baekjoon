// BOJ_27310_유치원생 파댕이 돌보기

import java.io.*;
import java.util.*;

public class BOJ_27310 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String emoji = br.readLine();

        /* ==========sol========== */
        
        int totalLength = emoji.length(); 
        
        int colonCount = 2; 
        
        int underscoreCount = 0;
        for (int i = 0; i < totalLength; i++) {
            if (emoji.charAt(i) == '_') {
                underscoreCount++;
            }
        }
        
        int difficulty = totalLength + colonCount + (underscoreCount * 5);

        /* ==========output========== */
        System.out.println(difficulty);
        br.close();
    }
}
