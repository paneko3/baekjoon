// BOJ_1302_베스트셀러

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1302 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            String temp = br.readLine();
            if(!map.containsKey(temp)){
                map.put(temp,1);
            }else {
                map.put(temp,map.get(temp)+1);
            }
        }
        /* ==========sol========== */
        int max = 0;
        for(String str : map.keySet()){
            max = Math.max(max,map.get(str));
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        /* ==========output========== */
        for(String str : list){
            if(max==map.get(str)){
                System.out.println(str);
                break;
            }
        }
        br.close();
    }
}
