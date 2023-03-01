// BOJ_11657_타임머신

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11657 {
    static int N, M;
    static int INF = (int)10e9;
    static ArrayList<Edge> edges;
    static class Edge{
        int nodeA, nodeB, cost;
        public Edge(int nodeA, int nodeB, int cost) {
            this.nodeA = nodeA;
            this.nodeB = nodeB;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        edges= new ArrayList<>();
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges.add(new Edge(nodeA, nodeB, cost));
        }
        /* ==========sol========== */
        /* ==========output========== */
        BellmanFord(1);
        br.close();
    }
    static void BellmanFord(int start){
        long[] dist = new long[N+1];
        Arrays.fill(dist,INF);
        dist[start]=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                Edge edge = edges.get(j);
                if(dist[edge.nodeA]!=INF&&dist[edge.nodeB]>dist[edge.nodeA]+edge.cost){
                    dist[edge.nodeB]=dist[edge.nodeA]+edge.cost;
                }
            }
        }
        for(int i=0;i<M;i++){
            Edge edge = edges.get(i);
            if(dist[edge.nodeA]!=INF&&dist[edge.nodeB]>dist[edge.nodeA]+edge.cost){
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=N;i++){
            if(dist[i]==INF){
                sb.append(-1).append("\n");
            }else {
                sb.append(dist[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
