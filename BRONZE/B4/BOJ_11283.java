// BOJ_11283_한글 2

import java.io.*;
import java.util.*;

public class BOJ_11283 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        
        /* ==========sol========== */
        // '가'의 유니코드 값은 44032입니다.
        // 입력받은 문자의 코드값에서 44032를 빼고, 1번째부터 시작하므로 +1을 해줍니다.
        int result = (int)c - 44032 + 1;
        
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
