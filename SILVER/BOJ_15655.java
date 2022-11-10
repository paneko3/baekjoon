// BOJ_15655_N과 M (6)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15655 {
    static int N,M;
    static int[] input,order;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        input=new int[N];
        order=new int[M];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(input);
        /* ==========output========== */
        combination(0,0);
        br.close();
    }
    static void combination(int count,int start){
        if(count==M){
            for(int i=0;i<M;i++){
                System.out.print(order[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<N;i++){
            order[count]=input[i];
            combination(count+1,i+1);
        }
    }

}
