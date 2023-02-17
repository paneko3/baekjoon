// BOJ_15665_N과 M (11)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_15665 {
    static int N, M;
    static int[] array,input;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N];
        input = new int[M];
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            array[i]= Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(array);
        com(0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void com(int count){
        if(count==M){
            for(Integer num : input){
                sb.append(num).append(" ");
            }
            sb.append("\t");
            return;
        }
        int num=0;
        for(int i=0;i<N;i++){
            if(num==array[i]){
                continue;
            }
            input[count]=array[i];
            com(count+1);
            num = array[i];
        }
    }
}
