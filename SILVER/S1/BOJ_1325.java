// BOJ_1325_효율적인 해킹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1325 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> graph = new ArrayList();
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(B).add(A);
        }
        int[] result = new int[N+1];
        int max=0;
        for(int i=1;i<=N;i++){
            boolean[] visited = new boolean[N+1];
            int count=0;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            visited[i]=true;
            while (!queue.isEmpty()){
                int now = queue.poll();
                for(int j : graph.get(now)){
                    if(!visited[j]){
                        queue.add(j);
                        visited[j]=true;
                        count++;
                    }
                }
            }
            result[i]=count;
            max=Math.max(max,count);
        }
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            if(result[i]==max){
                System.out.print(i + " ");
            }
        }
        br.close();
    }
}