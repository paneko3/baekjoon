// BOJ_28278_스택 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num==1){
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            }else if(num==2){
                sb.append(stack.isEmpty()?-1:stack.pop()).append("\n");
            }else if(num==3){
                sb.append(stack.size()).append("\n");
            }else if(num==4){
                sb.append(stack.isEmpty()?1:0).append("\n");
            }else if(num==5){
                sb.append(stack.isEmpty()?-1:stack.peek()).append("\n");
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}