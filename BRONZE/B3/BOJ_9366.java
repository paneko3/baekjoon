// BOJ_9366_삼각형 분류

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            if(a<b){
                int temp = a;
                a=b;
                b=temp;
            }
            if(a<c){
                int temp = a;
                a=c;
                c=temp;
            }
            /* ==========output========== */
            System.out.print("Case #"+i+": ");
            if(a>=b+c){
                System.out.println("invalid!");
            } else if(a==b&&a==c){
                System.out.println("equilateral");
            }else if(a==b||a==c||b==c){
                System.out.println("isosceles");
            }else {
                System.out.println("scalene");
            }
        }
        br.close();
    }
}