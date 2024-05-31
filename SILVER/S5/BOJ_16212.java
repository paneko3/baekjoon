// BOJ_16212_정열적인 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_16212 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()){
            sb.append(queue.poll()).append(" ");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}