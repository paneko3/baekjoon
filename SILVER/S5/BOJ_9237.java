// BOJ_9237_이장님 초대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_9237 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        Collections.sort(list, Collections.reverseOrder());
        int result = 0;
        for(int i=0;i<N;i++){
            result=Math.max(result,list.get(i)+i+1);
        }
        /* ==========output========== */
        System.out.println(result+1);
        br.close();
    }
}