// BOJ_4659_비밀번호 발음하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Loop: while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("end")){
                break;
            }
            boolean flag = false;
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("<"+str+"> is not acceptable.");
                continue Loop;
            }
            int a = 0;
            int b = 0;
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    a++;
                    b=0;
                }else {
                    a=0;
                    b++;
                }
                if(a==3||b==3){
                    System.out.println("<"+str+"> is not acceptable.");
                    continue Loop;
                }
            }
            char pre = str.charAt(0);
            for(int i=1;i<str.length();i++){
                char c = str.charAt(i);
                if(pre==c&&pre!='e'&&pre!='o'){
                    System.out.println("<"+str+"> is not acceptable.");
                    continue Loop;
                }
                pre=c;
            }
            /* ==========output========== */
            System.out.println("<"+str+"> is acceptable.");
        }
        br.close();
    }
}