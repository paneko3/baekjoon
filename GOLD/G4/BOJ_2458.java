// BOJ_2458_키 순서

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2458 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] graph = new boolean[N+1][N+1];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=true;
        }
        /* ==========sol========== */
        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(graph[i][k]&&graph[k][j]){
                        graph[i][j]=true;
                    }
                }
            }
        }
        int[] count = new int[N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(graph[i][j]||graph[j][i]){
                    count[i]++;
                }
            }
        }
        int result = 0;
        for(int i=1;i<=N;i++){
            if(count[i]==N-1){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}