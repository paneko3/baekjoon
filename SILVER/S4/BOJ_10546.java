// BOJ_10546_배부른 마라토너

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_10546 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        /* ==========sol========== */
        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else {
                map.put(str,1);
            }
        }
        for(int i=0;i<N-1;i++){
            String str = br.readLine();
            map.put(str,map.get(str)-1);
        }
        /* ==========output========== */
        for(String name : map.keySet()){
            if(map.get(name)==1){
                System.out.println(name);
                break;
            }
        }
        br.close();
    }
}