// BOJ_2003_수들의 합 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2003 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        long M=Long.parseLong(st.nextToken());
        int[] num =new int[N+1];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result=0;
        int left=0;
        int right=0;
        long sum=0;
        while (true){
            if(sum>=M){
                sum-=num[left++];
            }else if(right>N){
                break;
            }else {
                sum+=num[right++];
            }
            if(sum==M){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
