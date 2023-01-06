// BOJ_6549_히스토그램에서 가장 큰 직사각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }
            int[] num = new int[N];
            for(int i=0;i<N;i++){
                num[i]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            long result=0;
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<N;i++){
                while (!stack.isEmpty() && num[stack.peek()]>=num[i]){
                    int h = num[stack.pop()];
                    int w = stack.isEmpty()? i : i-1-stack.peek();
                    result=Math.max(result,(long)h*w);
                }
                stack.push(i);
            }
            while (!stack.isEmpty()){
                int h = num[stack.pop()];
                int w = stack.isEmpty()? N : N-1-stack.peek();
                result=Math.max(result,(long)h*w);
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
