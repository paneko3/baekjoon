// BOJ_1516_게임 개발

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1516 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N =Integer.parseInt(br.readLine());
        int[] time = new int[N+1];
        int[] indegree = new int[N+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            time[i] = cost;
            while (true){
                int num = Integer.parseInt(st.nextToken());
                if(num==-1){
                    break;
                }
                graph.get(num).add(i);
                indegree[i]++;
            }
        }
        /* ==========sol========== */
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        int[] result = new int[N+1];
        while (!queue.isEmpty()){
            int now = queue.poll();
            for(int temp : graph.get(now)){
                indegree[temp]--;
                result[temp] = Math.max(result[temp],result[now]+time[now]);
                if(indegree[temp]==0){
                    queue.add(temp);
                }
            }
        }
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            System.out.println(result[i]+time[i]);
        }
        br.close();
    }
}
