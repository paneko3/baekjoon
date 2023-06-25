// BOJ_1956_운동

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1956 {
    static int INF = (int)(10e8);
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int[][] graph = new int[V+1][V+1];
        for(int i=1;i<=V;i++){
            for(int j=1;j<=V;j++){
                graph[i][j]=i==j?0:INF;
            }
        }
        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[a][b]=c;
        }
        /* ==========sol========== */
        for(int k=1;k<=V;k++){
            for(int i=1;i<=V;i++){
                for(int j=1;j<=V;j++){
                    if(graph[i][j]>graph[i][k]+graph[k][j]){
                        graph[i][j]=graph[i][k]+graph[k][j];
                    }
                }
            }
        }
        int result = INF;
        for(int i=1;i<=V;i++){
            for(int j=1;j<=V;j++){
                if(i==j){
                    continue;
                }
                if(graph[i][j]!=INF&&graph[j][i]!=INF){
                    result=Math.min(result, graph[i][j]+graph[j][i]);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result==INF?-1:result);
        br.close();
    }
}