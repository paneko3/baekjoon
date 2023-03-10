// BOJ_2251_물통

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2251 {
    static Set<Integer> set;
    static int A,B,C;
    static boolean[][] check;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        check=new boolean[201][201];
        set= new TreeSet<>();
        dfs(0,0,C);
        /* ==========output========== */
        for(int num : set){
            System.out.print(num+" ");
        }
        br.close();
    }
    static void dfs(int a, int b, int c){
        if(check[a][b]){
            return;
        }
        if(a==0){
            set.add(c);
        }
        check[a][b]=true;
        if(a+b>B){
            dfs(a+b-B,B,c);
        }else {
            dfs(0,a+b,c);
        }
        if(a+b>A){
            dfs(A,a+b-A,c);
        }else {
            dfs(a+b,0,c);
        }
        if(a+c>A){
            dfs(A,b,a+c-A);
        }else {
            dfs(a+c,b,0);
        }
        if(b+c>B){
            dfs(a,B,b+c-B);
        }else {
            dfs(a,b+c,0);
        }
        dfs(a,0,b+c);
        dfs(0,b,a+c);
    }
}
