// BOJ_16165_걸그룹 마스터 준석이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_16165 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        HashMap<String, String> member = new HashMap<>();
        HashMap<String, ArrayList<String>> group = new HashMap<>();
        for(int i=0;i<N;i++){
            String g = br.readLine();
            ArrayList<String> list = new ArrayList<>();
            int K=Integer.parseInt(br.readLine());
            for(int j=0;j<K;j++){
                String name = br.readLine();
                member.put(name,g);
                list.add(name);
            }
            Collections.sort(list);
            group.put(g,list);
        }
        /* ==========output========== */
        for(int i=0;i<M;i++){
            String str = br.readLine();
            int t = Integer.parseInt(br.readLine());
            if(t==0){
                ArrayList<String> list = group.get(str);
                for(String name : list){
                    System.out.println(name);
                }
            }else {
                System.out.println(member.get(str));
            }
        }
        br.close();
    }
}