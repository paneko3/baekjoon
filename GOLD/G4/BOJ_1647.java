// BOJ_1647_도시 분할 계획

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1647 {
    static int[] parent;
    static Edge[] edges;
    static class Edge implements Comparable<Edge>{
        int nodeA,nodeB,cost;
        public Edge(int nodeA, int nodeB, int cost) {
            this.nodeA = nodeA;
            this.nodeB = nodeB;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        edges = new Edge[M];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges[i]=new Edge(nodeA,nodeB,cost);
        }
        /* ==========sol========== */
        parent= new int[N+1];
        for(int i=1;i<=N;i++){
            parent[i]=i;
        }
        Arrays.sort(edges);
        int result=0;
        int bigCost = 0;
        for(int i=0;i<M;i++){
            Edge edge = edges[i];
            if(find(edge.nodeA)!=find(edge.nodeB)){
                result+=edge.cost;
                union(edge.nodeA,edge.nodeB);
                bigCost = edge.cost;
            }
        }
        /* ==========output========== */
        System.out.println(result-bigCost);
        br.close();
    }
    static int find(int x){
        if(parent[x]==x){
            return x;
        }else {
            return parent[x]=find(parent[x]);
        }
    }
    static void union(int a, int b){
        a=find(a);
        b=find(b);
        if(a!=b){
            if(a>b){
                parent[b]=a;
            }else {
                parent[a]=b;
            }
        }
    }
}
