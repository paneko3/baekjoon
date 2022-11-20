// BOJ_15656_N과 M (7)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15656 {
    static int N,M;
    static int[] input,order;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        input=new int[N];
        order=new int[N];
        sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(input);
        per(0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void per(int count){
        if(count==M){
            for (int i=0;i<M;i++){
                sb.append(input[order[i]]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            order[count]=i;
            per(count+1);
        }
    }
}
