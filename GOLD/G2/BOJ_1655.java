// BOJ_1655_가운데를 말해요

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1655 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>(((o1, o2) -> o2-o1));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(br.readLine());
            if(left.size()==right.size()){
                right.add(num);
            }else {
                left.add(num);
            }
            if(!left.isEmpty()&&!right.isEmpty()&&left.peek()<right.peek()){
                int temp = left.poll();
                left.add(right.poll());
                right.add(temp);
            }

            sb.append(right.peek()).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
