// BOJ_9372_상근이의 여행

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_9372 {
    static int N, M, result;
    static boolean[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            result=0;
            graph = new boolean[N+1][N+1];
            visited= new boolean[N+1];
            for(int i=0;i<M;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b]=true;
                graph[b][a]=true;
            }
            /* ==========sol========== */
            bfs();
            /* ==========output========== */
            System.out.println(result-1);
        }
        br.close();
    }
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()){
            result++;
            int now = queue.poll();
            for(int i=1;i<=N;i++){
                if(graph[now][i]&&!visited[i]){
                   visited[i]=true;
                   queue.add(i);
                }
            }
        }
    }
}
