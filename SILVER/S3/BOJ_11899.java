// BOJ_11899_괄호 끼워넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_11899 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='('){
                stack.add(c);
            }else {
                if(stack.empty()){
                    result++;
                }else {
                    stack.pop();
                }
            }
        }
        result+=stack.size();
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}