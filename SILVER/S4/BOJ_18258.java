// BOJ_18258_큐 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int temp=0;
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push": {
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    temp=x;
                    break;
                }
                case "pop": {
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(queue.size()).append("\n");
                    break;
                }
                case "empty": {
                    if(queue.isEmpty()){
                        sb.append(1).append("\n");
                    }else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front": {
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                }
                case "back": {
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(temp).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
