// BOJ_2693_N번째 큰 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] num = new int[10];
            for(int j=0;j<10;j++){
                num[j]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            Arrays.sort(num);
            /* ==========output========== */
            System.out.println(num[7]);
        }
        br.close();
    }
}
