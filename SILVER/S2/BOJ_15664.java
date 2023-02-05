// BOJ_15664_N과 M (10)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_15664 {
    static int N,M;
    static int[] num, input;
    static boolean[] visit;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        num = new int[N];
        input = new int[M];
        visit = new boolean[N];
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        com(0,0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void com(int start, int count){
        if(count==M){
            for(int i=0;i<M;i++){
                sb.append(input[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int temp = 0;
        for(int i = start;i<N;i++){
            if(!visit[i]){
                if(temp==num[i]){
                    continue;
                }
                visit[i]=true;
                input[count]=num[i];
                com(i,count+1);
                visit[i]=false;
                temp = num[i];
            }
        }
    }
}
