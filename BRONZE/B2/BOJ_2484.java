// BOJ_2484_주사위 네개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_2484 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<N;i++){
            int sum = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=1;j<=6;j++){
                map.put(j,0);
            }
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                int num = Integer.parseInt(st.nextToken());
                map.put(num,map.get(num)+1);
            }
            int tmp = 0;
            int max = 0;
            for(int j=1;j<=6;j++){
                int v = map.get(j);
                if(v==4){
                    sum+=50000+j*5000;
                    break;
                }else if(v==3){
                    sum+=10000+j*1000;
                    break;
                }else if(v==2){
                    if(tmp!=0){
                        sum=2000+j*500+tmp*500;
                    }else {
                        sum+=1000+j*100;
                        tmp = j;
                    }
                }else if(v==1){
                    max = j;
                }
            }
            if(sum==0){
                sum+=max*100;
            }
            result=Math.max(result,sum);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}