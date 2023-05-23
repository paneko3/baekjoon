// BOJ_1138_한 줄로 서기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1138 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] people = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            people[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=N;i>=1;i--){
            list.add(people[i],i);
        }
        /* ==========output========== */
        for(int num : list){
            System.out.print(num + " ");
        }
        br.close();
    }
}