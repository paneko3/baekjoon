// BOJ_9466_텀 프로젝트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9466 {
    static int result;
    static int[] num;
    static boolean[] visited,finished;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            num = new int[n+1];
            visited = new boolean[n+1];
            finished = new boolean[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                num[i] = Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            result=0;
            for(int i=1;i<=n;i++){
                dfs(i);
            }
            /* ==========output========== */
            System.out.println(n - result);
        }
        br.close();
    }
    static void dfs(int now){
        if(visited[now]){
            return;
        }
        visited[now] = true;
        int next = num[now];
        if(visited[next] != true){
            dfs(next);
        }else {
            if(finished[next]!=true){
                result++;
                for(int i=next;i!=now;i=num[i]){
                    result++;
                }
            }
        }
        finished[now]=true;
    }
}
