// BOJ_2985_세 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2985 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        check1(a,b,c);
        br.close();
    }
    static void check1(int a, int b, int c){
        if(a==b+c){
            System.out.println(a + "=" + b + "+" +c);
            return ;
        }
        if(a==b-c){
            System.out.println(a + "=" + b + "-" +c);
            return ;
        }
        if(a==b*c){
            System.out.println(a + "=" + b + "*" +c);
            return ;
        }
        if(c!=0&&a==b/c){
            System.out.println(a + "=" + b + "/" +c);
            return ;
        }
        if(a+b==c){
            System.out.println(a + "+" + b + "=" +c);
            return ;
        }
        if(a-b==c){
            System.out.println(a + "-" + b + "=" +c);
            return ;
        }
        if(a*b==c){
            System.out.println(a + "*" + b + "=" +c);
            return ;
        }
        if(b!=0&&a/b==c){
            System.out.println(a + "/" + b + "=" +c);
            return ;
        }
    }

}