// BOJ_4195_친구 네트워크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_4195 {
    static int[] parent,level;
    static int find(int x){
        if(parent[x]==x){
            return x;
        }else {
            return parent[x] = find(parent[x]);
        }
    }
    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a==b){
            return;
        }
        parent[b]=a;
        level[a]+=level[b];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int F = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            String[] strings = new String[F];
            int idx=0;
            for(int i=0;i<F;i++){
                strings[i]=br.readLine();
                st = new StringTokenizer(strings[i]);
                String a = st.nextToken();
                String b = st.nextToken();
                if(!map.containsKey(a)){
                    map.put(a,idx++);
                }
                if(!map.containsKey(b)){
                    map.put(b,idx++);
                }
            }
            /* ==========sol========== */
            parent= new int[map.size()];
            level= new int[map.size()];
            for(int i=0;i<map.size();i++){
                parent[i]=i;
                level[i]=1;
            }
            /* ==========output========== */
            for(int i=0;i<F;i++){
                st = new StringTokenizer(strings[i]);
                int idxA = map.get(st.nextToken());
                int idxB = map.get(st.nextToken());
                union(idxA,idxB);
                sb.append(level[find(idxB)]).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
