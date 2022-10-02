// BOJ_1075_나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1292 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] num= new int[1001];
        int n=1;
        int cur=1;
        while (cur<=1000){
            for(int i=1;i<=n;i++){
                if(cur>1000) break;
                num[cur++]=n;
            }
            n++;
        }
        int sum=0;
        for(int i=A;i<=B;i++){
            sum+=num[i];
        }
        /* ==========output========== */
        System.out.println(sum);
        br.close();
    }
}
