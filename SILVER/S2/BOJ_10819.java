// BOJ_10819_차이를 최대로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10819 {
    static int N,max;
    static int[] input,order;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N=Integer.parseInt(br.readLine());
        input = new int[N];
        order = new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        max=0;
        per(0,new boolean[N]);
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
    static void per (int cnt,boolean[] visited){
        if(cnt==N){
            int sum=0;
            for(int i=0;i<N-1;i++){
                sum+=Math.abs(input[order[i]]-input[order[i+1]]);
            }
            max=Math.max(max,sum);
            return;
        }
        for(int i=0;i<N;i++){
            if(visited[i]) continue;
            visited[i]=true;
            order[cnt]=i;
            per(cnt+1,visited);
            visited[i]=false;
        }
    }
}
