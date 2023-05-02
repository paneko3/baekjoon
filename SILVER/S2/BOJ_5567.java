// BOJ_5567_결혼식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_5567 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        /* ==========sol========== */
        boolean[] visit = new boolean[n+1];
        visit[1]=true;
        dfs(0,1,visit,graph);
        int result = 0;
        for(int i=2;i<=n;i++){
            if(visit[i]){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void dfs(int count, int now, boolean[] visit,ArrayList<ArrayList<Integer>> graph){
        if(count==2){
            return;
        }
        for(int next: graph.get(now)){
            visit[next]=true;
            dfs(count+1,next,visit,graph);
        }
    }
}