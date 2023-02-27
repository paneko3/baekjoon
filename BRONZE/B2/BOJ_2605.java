// BOJ_2605_줄 세우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2605 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int k = Integer.parseInt(st.nextToken());
            if(k==0){
                list.add(i+1);
            }else {
                list.add(list.size()-k,i+1);
            }
        }
        /* ==========output========== */
        for(int num: list){
            System.out.print(num + " ");
        }
        br.close();
    }
}
