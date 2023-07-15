// BOJ_11576_Base Conversion

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_11576 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            sum += Math.pow(A,m-i-1)*num;
        }
        /* ==========sol========== */
        Stack<Integer> stack = new Stack<>();
        while(sum!=0){
            stack.push(sum%B);
            sum/=B;
        }
        /* ==========output========== */
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        br.close();
    }
}