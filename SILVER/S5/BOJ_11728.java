// BOJ_11728_배열 합치기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11728 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr1= new int[N+1];
        int[] arr2= new int[M+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */=
        int idx1=0;
        int idx2=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N+M;i++){
            if(idx1==N){
                sb.append(arr2[idx2++]);
                sb.append(" ");
                continue;
            }else if(idx2==M){
                sb.append(arr1[idx1++]);
                sb.append(" ");
                continue;
            }
            int temp1 = arr1[idx1];
            int temp2 = arr2[idx2];
            if(temp1<temp2){
                sb.append(temp1);
                idx1++;
            }else {
                sb.append(temp2);
                idx2++;
            }

            sb.append(" ");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}