// BOJ_1268_임시 반장 정하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1268 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] num = new int[N][5];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                num[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int[] count = new int[N];
        for(int i=0;i<N;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<5;j++){
                for(int k=0;k<N;k++){
                    if(k==i){
                        continue;
                    }
                    if(num[i][j]==num[k][j]){
                        set.add(k);
                    }
                }
            }
            count[i]=set.size();
        }
        int result = 0;
        int max = 0;
        for(int i=0;i<N;i++){
            if(count[i]>max){
                result = i;
                max = count[i];
            }
        }
        /* ==========output========== */
        System.out.println(result+1);
        br.close();
    }
}