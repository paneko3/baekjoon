// BOJ_24480_알고리즘 수업 - 깊이 우선 탐색 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_24480 {
    static int N, M, R, count;
    static ArrayList<Integer>[] E;
    static int[] result;
    static boolean[] V;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        E = new ArrayList[N+1];
        V = new boolean[N+1];
        result = new int[N+1];
        for(int i=0;i<=N;i++){
            E[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            E[u].add(v);
            E[v].add(u);
        }
        /* ==========sol========== */
        for(int i=1;i<=N;i++){
            E[i].sort(Comparator.reverseOrder());
        }
        count = 1;
        dfs(R);
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            System.out.println(result[i]);
        }
        br.close();
    }
    static void dfs(int R){
        result[R] = count++;
        V[R]=true;
        for (int n : E[R]) {
            if (V[n]){
                continue;
            }
            dfs(n);
        }
    }
}