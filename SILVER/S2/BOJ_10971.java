// BOJ_10971_외판원 순회 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10971 {
    static int N,result;
    static int[][] edges;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N=Integer.parseInt(br.readLine());
        visited=new boolean[N];
        edges = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                edges[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        result=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            visited[i]=true;
            fun(0,i,i,0);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void fun(int count,int start,int now,int sum){
        if(count==N-1){
            if(edges[now][start]!=0){
                sum+=edges[now][start];
                result= Math.min(result,sum);
            }
            return;
        }
        for(int i=0;i<N;i++){
            if(visited[i]||edges[now][i]==0) continue;
            visited[i]=true;
            fun(count+1,start,i,sum+edges[now][i]);
            visited[i]=false;
        }
    }
}
