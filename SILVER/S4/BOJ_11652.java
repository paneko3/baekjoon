// BOJ_11652_카드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_11652 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long,Integer> map = new HashMap<>();
        int max=0;
        long result=0;
        for(int i=0;i<N;i++){
            Long temp = Long.parseLong(br.readLine());
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else {
                map.put(temp,1);
            }
            if(map.get(temp)>max){
                max=map.get(temp);
                result=temp;
            }else if(map.get(temp)==max) {
                result=Math.min(result,temp);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
