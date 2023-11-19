// BOJ_7510_고급 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i=1;i<=N;i++){
            /* ==========input========== */
            int[] num = new int[3];
            st = new StringTokenizer(br.readLine());
            num[0]=Integer.parseInt(st.nextToken());
            num[1]=Integer.parseInt(st.nextToken());
            num[2]=Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            Arrays.sort(num);
            System.out.println("Scenario #" + i + ":");
            if(num[2]*num[2]==num[0]*num[0]+num[1]*num[1]){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            /* ==========output========== */
            System.out.println();
        }
        br.close();
    }
}