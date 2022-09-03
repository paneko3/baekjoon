// BOJ_10799_쇠막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        /* ==========sol========== */
        Stack<Character> stack = new Stack<Character>();
        int result=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }else {
                stack.pop();
                if(str.charAt(i-1)=='('){
                    result+=stack.size();
                }else {
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
