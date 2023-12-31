// BOJ_1551_수열의 변화

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1551 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        String[] str = br.readLine().split(",");
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(str[i]));
        }
        /* ==========sol========== */
        for(int i=0;i<K;i++){
            ArrayList<Integer> copy = new ArrayList<>(list);
            list = new ArrayList<>();
            for(int j=0;j<copy.size()-1;j++){
                list.add(copy.get(j+1)-copy.get(j));
            }
        }
        /* ==========output========== */
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + (i!=(list.size()-1)?",":""));
        }
        br.close();
    }
}