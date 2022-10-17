// BOJ_10988_팰린드롬인지 확인하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<len;i++){
            if(len%2==0){
                if(i<len/2){
                    stack.add(str.charAt(i));
                }else{
                    if(stack.pop()!=str.charAt(i)){
                        System.out.println(0);
                        return;
                    }
                }
            }else {
                if(i<len/2){
                    stack.add(str.charAt(i));
                }else if(i==len/2) {
                } else if(stack.pop()!=str.charAt(i)){
                        System.out.println(0);
                        return;

                }

            }
        }
        System.out.println(1);
        br.close();
    }
}
