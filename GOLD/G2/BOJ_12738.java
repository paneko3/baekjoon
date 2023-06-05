// BOJ_12738_가장 긴 증가하는 부분 수열 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_12738 {
    static int[] num, dp;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.MIN_VALUE);
        for(int i=0;i<N;i++){
            int temp = num[i];
            int left = 1;
            int right = list.size() - 1;
            if(temp>list.get(list.size()-1)){
                list.add(temp);
            }else {
                while (left<right){
                    int mid = (left+right)/2;
                    if(list.get(mid)>=temp){
                        right = mid;
                    }else {
                        left = mid + 1;
                    }
                }
                list.set(right,temp);
            }
        }
        /* ==========output========== */
        System.out.println(list.size()-1);
        br.close();
    }
}