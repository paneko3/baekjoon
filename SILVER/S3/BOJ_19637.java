// BOJ_19637_IF문 좀 대신 써줘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19637 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] name = new String[N];
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            name[i]=st.nextToken();
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            int num = Integer.parseInt(br.readLine());
            int left = 0;
            int right = N-1;
            while (left<=right){
                int mid = (left+right)/2;
                if(arr[mid]<num){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
            sb.append(name[left]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}