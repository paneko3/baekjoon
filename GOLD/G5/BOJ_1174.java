// BOJ_1174_줄어드는 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_1174 {
    static int N;
    static int[] arr = {9,8,7,6,5,4,3,2,1,0};
    static List<Long> list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        list = new ArrayList<>();
        dfs(0,0);
        Collections.sort(list);
        /* ==========output========== */
        System.out.println(list.size()<N?"-1":list.get(N-1));
        br.close();
    }
    static void dfs(long num, int idx){
        if(!list.contains(num)){
            list.add(num);
        }
        if(idx>=10){
            return;
        }
        dfs((num*10)+arr[idx],idx+1);
        dfs(num,idx+1);
    }
}