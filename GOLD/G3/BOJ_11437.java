// BOJ_11437_LCA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11437 {
    static ArrayList<Integer>[] list;
    static int[] parent, depth;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        depth = new int[N+1];
        list = new ArrayList[N+1];
        for(int i=0;i<=N;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<N-1;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        /* ==========sol========== */
        init(1,1,0);
        int m = Integer.parseInt(br.readLine());
        /* ==========output========== */
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(LCA(a,b));
        }
        br.close();
    }
    static void init(int cur, int h, int p){
        depth[cur]=h;
        parent[cur]=p;
        for(int n : list[cur]){
            if(n != p){
                init(n, h+1, cur);
            }
        }
    }
    static int LCA(int a, int b){
        int ah = depth[a];
        int bh = depth[b];
        while (ah > bh){
            a = parent[a];
            ah--;
        }
        while (bh > ah){
            b = parent[b];
            bh--;
        }
        while (a!=b){
            a = parent[a];
            b = parent[b];
        }
        return a;
    }
}