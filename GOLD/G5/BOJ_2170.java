// BOJ_2170_선 긋기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_2170 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0]=x;
            arr[i][1]=y;
        }
        /* ==========sol========== */
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else {
                    return o1[0]-o2[0];
                }
            }
        });
        int min = arr[0][0];
        int max = arr[0][1];
        int result = max - min;
        for(int i=1;i<N;i++){
            if(min<=arr[i][0]&&arr[i][1]<max){
                continue;
            }else if(arr[i][0]<max){
                result += arr[i][1] - max;
            }else {
                result += arr[i][1] - arr[i][0];
            }
            min = arr[i][0];
            max = arr[i][1];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}