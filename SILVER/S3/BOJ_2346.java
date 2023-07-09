// BOJ_2346_풍선 터뜨리기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2346 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(" ");
        for(int i=1;i<N;i++){
            deque.add(new int[]{i+1,arr[i]});
        }
        int num = arr[0];
        while (!deque.isEmpty()){
            if(num>0){
                for(int i=1;i<num;i++){
                    deque.add(deque.poll());
                }
                int[] temp = deque.poll();
                num = temp[1];
                sb.append(temp[0]).append(" ");
            }else {
                for(int i=1;i<-num;i++){
                    deque.addFirst(deque.pollLast());
                }
                int[] temp = deque.pollLast();
                num = temp[1];
                sb.append(temp[0]).append(" ");
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}