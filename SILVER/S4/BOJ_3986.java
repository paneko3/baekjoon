// BOJ_3986_좋은 단어

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result=0;
        for(int i=0;i<N;i++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            Stack<Character> stack = new Stack<>();
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if(!stack.isEmpty()&&stack.peek()==c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
                if(stack.size()>=3){
                    continue;
                }
            }
            if(stack.isEmpty()){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
