// BOJ_4386_별자리 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_4386 {
    static int[] parent;
    static class Node{
        int idx;
        double x,y;
        public Node(int idx, double x, double y) {
            this.idx = idx;
            this.x = x;
            this.y = y;
        }
    }
    static class Edge implements Comparator<Edge>{
        int idxA, idxB;
        double dis;
        public Edge(int idxA, int idxB, double dis) {
            this.idxA = idxA;
            this.idxB = idxB;
            this.dis = dis;
        }
        @Override
        public int compare(Edge o1, Edge o2) {
            return Double.compare(o1.dis, o2.dis);
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Node[] nodes = new Node[N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            nodes[i]=new Node(i,Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
        }
        /* ==========sol========== */
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i=1;i<=N;i++){
            for(int j=i+1;j<=N;j++){
                double dis = Math.sqrt(Math.pow(nodes[i].x-nodes[j].x,2)+Math.pow(nodes[i].y-nodes[j].y,2));
                edges.add(new Edge(i,j,dis));
            }
        }
        Collections.sort(edges, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return Double.compare(o1.dis,o2.dis);
            }
        });
        parent = new int[N+1];
        for(int i=1;i<=N;i++){
            parent[i]=i;
        }
        double result = 0;
        for(Edge e : edges){
            if(find(e.idxA)!=find(e.idxB)){
                result+=e.dis;
                union(e.idxA,e.idxB);
            }
        }
        /* ==========output========== */
        System.out.printf("%.2f",result);
        br.close();
    }
    static int find(int x){
        if(parent[x]==x){
            return x;
        }else {
            return parent[x]=find(parent[x]);
        }
    }
    static void union(int A, int B){
        A = find(A);
        B = find(B);
        if(A!=B){
            parent[B]=A;
        }
    }
}