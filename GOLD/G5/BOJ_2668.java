// BOJ_2668_숫자고르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2668 {
    static int[] num;
    static boolean[] visit;
    static ArrayList<Integer> list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        num = new int[N+1];
        for(int i=1;i<=N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        visit = new boolean[N+1];
        list= new ArrayList<>();
        for(int i=1;i<=N;i++){
            visit[i]= true;
            dfs(i,i);
            visit[i]=false;
        }
        Collections.sort(list);
        /* ==========output========== */
        System.out.println(list.size());
        for(int i : list){
            System.out.println(i);
        }
        br.close();
    }
    static void dfs(int start, int target){
        if(visit[num[start]]==false){
            visit[num[start]]=true;
            dfs(num[start],target);
            visit[num[start]]=false;
        }
        if(num[start]==target){
            list.add(target);
        }
    }
}
