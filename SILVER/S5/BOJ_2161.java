// BOJ_2161_카드1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        /* ==========sol========== */
        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        /* ==========output========== */
        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
            if(!queue.isEmpty()){
                queue.add(queue.poll());
            }
        }
        br.close();
    }
}
