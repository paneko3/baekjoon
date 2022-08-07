// BOJ_25304_영수증

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25304 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int X= Integer.parseInt(br.readLine());
        int N= Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            sum+=a*b;
        }
        /* ==========output========== */
        if(X==sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        br.close();
    }
}
