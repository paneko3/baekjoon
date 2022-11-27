// BOJ_2504_괄호의 값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2504 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        /* ==========sol========== */
        Stack<Character> stack = new Stack<>();
        int result=0;
        int count=1;
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if(temp=='('){
                stack.push(temp);
                count*=2;
            }else if(temp=='['){
                stack.push(temp);
                count*=3;
            }else {
                if (temp == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }
                    if (str.charAt(i - 1) == '(') {
                        result += count;
                    }
                    stack.pop();
                    count /= 2;
                } else if (temp == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }
                    if (str.charAt(i - 1) == '[') {
                        result += count;
                    }
                    stack.pop();
                    count /= 3;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        /* ==========output========== */
        System.out.println(flag&&stack.isEmpty()?result:0);
        br.close();
    }
}
