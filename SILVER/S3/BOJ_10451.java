// BOJ_10451_순열 사이클

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10451 {
    static int N;
    static int[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            N = Integer.parseInt(br.readLine());
            graph= new int[N+1];
            visited= new boolean[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1;i<=N;i++){
                graph[i]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            int result=0;
            for(int i=1;i<=N;i++){
                if(!visited[graph[i]]){
                    result++;
                    dfs(i,graph[i]);
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static void dfs(int i,int x) {
        visited[i]=true;
        if(!visited[x]){
            dfs(x,graph[x]);
        }
    }
}
