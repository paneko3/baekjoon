// BOJ_1707_이분 그래프

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1707 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K=Integer.parseInt(br.readLine());
        LOOP:for(int test_case=1;test_case<=K;test_case++){
            st =new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
            for(int i=0;i<=V;i++){
                edges.add(new ArrayList<>());
            }
            for(int i=1;i<=E;i++){
                st=new StringTokenizer(br.readLine());
                int to=Integer.parseInt(st.nextToken());
                int from=Integer.parseInt(st.nextToken());
                edges.get(to).add(from);
                edges.get(from).add(to);
            }
            /* ==========sol========== */
            /* ==========output========== */
            int[] type = new int[V+1];
            Queue<Integer> queue = new LinkedList<>();
            for(int v=1;v<=V;v++){
                if(type[v]==0){
                    queue.add(v);
                    type[v]=1;
                }
                while(!queue.isEmpty()){
                    int now = queue.poll();
                    int nowType = type[now];
                    for(int i=0;i<edges.get(now).size();i++) {
                        int temp = edges.get(now).get(i);
                        if (type[temp] == 0) {
                            queue.add(temp);
                        }
                        if (nowType == type[temp]) {
                            System.out.println("NO");
                            continue LOOP;
                        }
                        if (type[temp] == 0) {
                            type[temp] = nowType == 1 ? 2 : 1;
                        }
                    }
                }
            }
            System.out.println("YES");
        }
        br.close();
    }
}
