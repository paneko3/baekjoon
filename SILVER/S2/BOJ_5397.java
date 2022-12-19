// BOJ_5397_키로거

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            Stack<Character> left = new Stack<>();
            Stack<Character> right  = new Stack<>();
            for(int i=0;i<str.length();i++){
                char now = str.charAt(i);
                if(now=='<'){
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                }else if(now=='>'){
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                }else if(now=='-'){
                    if(!left.isEmpty()){
                        left.pop();
                    }
                }else {
                    left.push(now);
                }
            }
            while (!left.isEmpty()){
                right.push(left.pop());
            }
            StringBuilder sb = new StringBuilder();
            while (!right.isEmpty()){
                sb.append(right.pop());
            }
            /* ==========output========== */
            System.out.println(sb);
        }
        br.close();
    }
}
