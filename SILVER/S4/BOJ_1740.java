// BOJ_1740_거듭제곱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1740 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        /* ==========sol========== */
        long result = 0;
        int count = 0;
        while (N>0){
            if((N&1)==1){
                result+=p(3,count);
            }
            count++;
            N=(N>>1);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static long p(long a, long b){
        if(b==0){
            return 1;
        }else if(b==1){
            return a;
        }
        long temp = p(a,b/2);
        if(b%2==0){
            return (temp*temp);
        }else {
            return ((temp*temp)*a);
        }
    }
}