// BOJ_1672_DNA 해독

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1672 {
    static char[][] arr = {{'A','C','A','G'},{'C','G','T','A'},{'A','T','C','G'},{'G','A','G','T'}};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int pre = revert(str.charAt(N-1));
        /* ==========sol========== */
        for(int i=N-1;i>0;i--){
            int x = revert(str.charAt(i-1));
            int y = pre;
            char c = arr[x][y];
            pre = revert(c);
        }
        /* ==========output========== */
        System.out.println(pre==0?'A':pre==1?'G':pre==2?'C':'T');
        br.close();
    }
    static int revert(char c){
        return c=='A'?0:c=='G'?1:c=='C'?2:3;
    }
}