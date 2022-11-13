// BOJ_9613_GCD 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t= Integer.parseInt(br.readLine());
        for(int test_case=0;test_case<t;test_case++){
            /* ==========input========== */
            st  = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            long result=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    result+=gcd(num[i],num[j]);
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static int gcd(int i,int j){
        if(j==0) return i;
        else return gcd(j,i%j);
    }
}
