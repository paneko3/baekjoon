// BOJ_18352_특정 거리의 도시 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_18352 {
    static int N, M, K, X;
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for(int i=0;i<=N;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            list.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        boolean[] visit = new boolean[N+1];
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        visit[X] = true;
        boolean flag = false;
        int count=1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int now = queue.poll();
                for(int temp : list.get(now)){
                    if(!visit[temp]){
                        visit[temp]=true;
                        queue.add(temp);
                        if(count==K){
                            result.add(temp);
                            flag=true;
                        }
                    }
                }
            }

            count++;
        }
        /* ==========output========== */
        if(flag){
            Collections.sort(result);
            for(int temp : result){
                System.out.println(temp);
            }
        }else {
            System.out.println(-1);
        }
        br.close();
    }
}
