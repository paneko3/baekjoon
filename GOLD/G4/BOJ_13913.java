// BOJ_13913_검증수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_13913 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] visited = new int[100001];
        int[] parent = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N]=1;
        while (!queue.isEmpty()){
            int now = queue.poll();
            if(now == K){
                break;
            }
            if(now+1<=100000&&visited[now+1] ==0){
                visited[now+1]= visited[now]+1;
                parent[now+1]=now;
                queue.add(now+1);
            }
            if(now-1>=0&&visited[now-1] ==0){
                visited[now-1]= visited[now]+1;
                parent[now-1]=now;
                queue.add(now-1);
            }
            if(now*2<=100000&&visited[now*2] ==0){
                visited[now*2]= visited[now]+1;
                parent[now*2]=now;
                queue.add(now*2);
            }
        }
        /* ==========output========== */
        System.out.println(visited[K]-1);
        Stack<Integer> stack = new Stack<>();
        int idx = K;
        while (idx!=N){
            stack.push(idx);
            idx = parent[idx];
        }
        stack.push(idx);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

        br.close();
    }
}
