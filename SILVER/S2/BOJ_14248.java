// BOJ_14248_점프 점프

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14248 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int S = Integer.parseInt(br.readLine())-1;

        /* ==========sol========== */
        boolean[] visited = new boolean[N];
        int result = 0;

        int[] queue = new int[N];
        int front = 0;
        int rear = 0;

        queue[rear++] = S;
        visited[S] = true;

        while(front<rear){
            int now = queue[front++];

            int left = now-arr[now];
            int right = now+arr[now];

            if(left>=0 && !visited[left]){
                visited[left] = true;
                queue[rear++] = left;
            }

            if(right<N && !visited[right]){
                visited[right] = true;
                queue[rear++] = right;
            }
        }

        for(int i=0;i<N;i++){
            if(visited[i]){
                result++;
            }
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
