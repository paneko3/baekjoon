// BOJ_1068_트리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1068 {
    static int N,M,root,result;
    static Node[] graph;
    static class Node{
        int index;
        ArrayList<Node> child = new ArrayList<>();
        public Node(int index) {
            this.index = index;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new Node[N];
        for(int i=0;i<N;i++){
            graph[i]=new Node(i);
        }
        st = new StringTokenizer(br.readLine());
        root=0;
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp==-1){
                root=i;
            }else {
                graph[temp].child.add(graph[i]);
            }
        }
        M = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        result=0;
        if(M!=root){
            delete(root);
            dfs(root);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void delete(int index){
        for(Node child : graph[index].child){
            if(child.index==M){
                graph[index].child.remove(child);
                return;
            }
            delete(child.index);
        }
    }
    static void dfs(int index){
        if(graph[index].child.size() == 0 ){
            result++;
            return;
        }
        for(Node node :  graph[index].child){
            dfs(node.index);
        }
    }
}
