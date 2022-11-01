// BOJ_2512_예산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2512 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        int right =0;
        int left =0;
        for(int i=0;i<N;i++){
            int temp=Integer.parseInt(st.nextToken());
            num[i]=temp;
            right= Math.max(right,temp);
        }
        int M=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result=0;
        while (left<=right){
            int mid = (right+left)/2;
            if(check(num,mid,M)){
                result=Math.max(result,mid);
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        /* ==========output========== */
        System.out.println(right);
        br.close();
    }
    static boolean check(int[] num,int mid,int M){
        int sum=0;
        for (int j : num) {
            sum += Math.min(j, mid);
        }
        return sum <= M;
    }
}
