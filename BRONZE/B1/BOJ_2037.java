// BOJ_2037_문자메시지

import java.io.*;
import java.util.*;

public class BOJ_2037 {
    
    static char[][] ph = {
        {},
        {},{'A','B','C'},{'D','E','F'},
        {'G','H','I'},{'J','K','L'},{'M','N','O'},
        {'P','Q','R','S'},{'T','U','V'},{'W','X','Y','Z'}
    };
    static int result = 0;
    static int btnNum = 0;
    
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        
        /* ==========sol========== */
        for(char alphabet : arr) {
            if(alphabet == ' ') {
                result += p;
                btnNum = 1;
            } else {
                chk(alphabet, p, w);
            }
        }
        
        /* ==========output========== */
        System.out.println(result);
    }
    
    public static void chk(char alphabet, int p, int w) {
        for(int i = 2; i < ph.length; i++) {
            int sec = 0;
            for(int j = 0; j < ph[i].length; j++) {
                sec += p;
                if(btnNum == i) {
                    sec += w;
                    btnNum = 0;
                }
                
                if(alphabet == ph[i][j]) {
                    result += sec;
                    btnNum = i;
                    return;
                }
            }
        }
    }
}
