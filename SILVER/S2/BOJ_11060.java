// BOJ_11060_점프 점프

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11060 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[N];
        queue.add(0);
        visit[0]=true;
        int result = 0;
        if(N==1){
            System.out.println(0);
            return;
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            result++;
            for(int i=0;i<size;i++){
                int now = queue.poll();
                int num = arr[now];
                for(int j=now+1;j<=now+num;j++){
                    if(j==N-1){
                        System.out.println(result);
                        return;
                    }
                    if(j<N&&!visit[j]){
                        queue.add(j);
                        visit[j]=true;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(-1);
        br.close();
    }
}