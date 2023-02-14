// BOJ_11005_진법 변환 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Stack<Character> stack = new Stack<>();
        while (N>0){
            int temp = N%B;
            if(temp>=0&&temp<=9){
                stack.push((char)('0'+temp));
            }else {
                stack.push((char)('A'+temp-10));
            }
            N=N/B;
        }
        /* ==========output========== */
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        br.close();
    }
}
