// BOJ_12789_도키도키 간식드리미

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_12789 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        Stack<Integer> stack = new Stack<>();
        int idx = 1;
        while (!queue.isEmpty()){
            if(queue.peek()==idx){
                queue.poll();
                idx++;
            }else if(!stack.isEmpty()&&stack.peek()==idx){
                stack.pop();
                idx++;
            }else {
                stack.push(queue.poll());
            }
        }
        /* ==========output========== */
        while (!stack.isEmpty()){
            if(stack.peek()==idx){
                stack.pop();
                idx++;
            }else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
        br.close();
    }
}