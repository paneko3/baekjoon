// BOJ_12790_Mini Fantasy War

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12790 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[8];
            for(int i=0;i<8;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            int HP = arr[0]+arr[4]>0?arr[0]+arr[4]:1;
            int MP = arr[1]+arr[5]>0?arr[1]+arr[5]:1;
            int ATK = arr[2]+arr[6]>0?arr[2]+arr[6]:0;
            int DEF = arr[3]+arr[7];
            /* ==========output========== */
            System.out.println(HP+5*MP+2*ATK+2*DEF);
        }
        br.close();
    }
}