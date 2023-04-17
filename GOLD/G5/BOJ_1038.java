// BOJ_1038_감소하는 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_1038 {
    static ArrayList<Long> list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        list = new ArrayList<>();
        /* ==========output========== */
        if(N<=10){
            System.out.println(N);
        }else if(N>1022){
            System.out.println(-1);
        }else {
            for(int i=0;i<10;i++){
                recur(i,1);
            }
            Collections.sort(list);
            System.out.println(list.get(N));
        }
        br.close();
    }
    static void recur(long num, int count){
        if(count > 10){
            return;
        }
        list.add(num);
        for(int i=0;i<num%10;i++){
            recur((num*10)+i,count+1);
        }
    }
}