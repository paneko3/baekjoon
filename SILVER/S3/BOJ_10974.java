// BOJ_10974_모든 순열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10974 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int[] input = new int[N];
        for(int i=0;i<N;i++){
            input[i]=i+1;
        }
        dfs(N,0,input,new int[N],new boolean[N]);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void dfs(int N,int count, int[] input, int[] order, boolean[] visited){
        if(count==N){
            for(int i=0;i<N;i++){
                sb.append(input[order[i]]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(visited[i]) continue;
            visited[i]=true;
            order[count]=i;
            dfs(N,count+1,input,order,visited);
            visited[i]=false;
        }
    }
}
