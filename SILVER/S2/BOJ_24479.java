// BOJ_24479_알고리즘 수업 - 깊이 우선 탐색 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_24479 {
    static int N,M,R,cur;
    static int[] result;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        result = new int[N+1];
        visit = new boolean[N+1];
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        /* ==========sol========== */
        for(int i=1;i<=N;i++){
            Collections.sort(graph.get(i));
        }
        cur = 1;
        dfs(R);
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            System.out.println(result[i]);
        };
        br.close();
    }
    static void dfs(int now){
        result[now]=cur++;
        visit[now]=true;
        for(int i : graph.get(now)){
            if(visit[i]){
                continue;
            }
            dfs(i);
        }
    }
}