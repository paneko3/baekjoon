// BOJ_5554_심부름 가는 길

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5554 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        for(int i=0;i<4;i++){
            result+=Integer.parseInt(br.readLine());
        }
        /* ==========output========== */
        System.out.println(result/60);
        System.out.println(result%60);
        br.close();
    }
}
