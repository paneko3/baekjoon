// BOJ_2531_회전 초밥

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2531 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<k;i++){
            map.putIfAbsent(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);
        }
        count = map.keySet().size();
        if(!map.containsKey(c)){
            count++;
        }
        result = count;
        int start = 0;
        int end = k;
        while (start<N){
            if(end>=N){
                end = end % N;
            }
            map.putIfAbsent(arr[start], 0);
            map.put(arr[start], map.get(arr[start])-1);
            map.putIfAbsent(arr[end], 0);
            map.put(arr[end], map.get(arr[end])+1);
            if (map.get(arr[start])<=0) {
                map.remove(arr[start]);
            }
            int temp = map.keySet().size();
            if(!map.containsKey(c)){
                temp++;
            }
            result = Math.max(result, temp);
            start++;
            end++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}