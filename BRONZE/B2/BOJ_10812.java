// BOJ_10812_바구니 순서 바꾸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_10812 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int n=1;n<=N;n++){
            list.add(n);
        }
        for(int m=0;m<M;m++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int temp = list.get(i-1);
            int end = list.get(k-1);
            while (temp != end){
                list.remove(i-1);
                list.add(j-1,temp);
                temp = list.get(i-1);
            }
        }
        /* ==========output========== */
        for(int n : list){
            System.out.print(n+" ");
        }
        br.close();
    }
}