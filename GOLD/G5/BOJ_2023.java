// BOJ_2023_신기한 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2023 {
    static int N;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        sb = new StringBuilder();
        dfs(0,"");
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void dfs(int count, String str){
        if(count==N){
            sb.append(str+"\n");
            return;
        }
        for(int i=1;i<=9;i++){
            if(prime(Integer.parseInt(str+i))){
                dfs(count+1,str+i);
            }
        }
    }
    static boolean prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}