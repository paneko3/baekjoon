// BOJ_2503_숫자 야구

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2503 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] num = new int[N];
        int[] strike = new int[N];
        int[] ball = new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            num[i]=Integer.parseInt(st.nextToken());
            strike[i]=Integer.parseInt(st.nextToken());
            ball[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result=0;
        for(int i=123;i<=987;i++){
            int s=0;
            int b=0;
            int check=0;
            if(i/100==i/10%10){
                continue;
            }else if(i/10%10==i%10){
                continue;
            }else if(i/100==i%10){
                continue;
            }else if(i/10%10==0){
                continue;
            }else if(i%10==0){
                continue;
            }
            for(int j=0;j<N;j++){
                s=0;
                b=0;
                if(num[j]/100==i/100){
                    s++;
                }else {
                    if(num[j]/10%10==i/100){
                        b++;
                    }else if(num[j]%10==i/100){
                        b++;
                    }
                }
                if(num[j]/10%10==i/10%10){
                    s++;
                }else {
                    if(num[j]/100==i/10%10){
                        b++;
                    }else if(num[j]%10==i/10%10){
                        b++;
                    }
                }
                if(num[j]%10==i%10){
                    s++;
                }else {
                    if(num[j]/100==i%10){
                        b++;
                    }else if(num[j]/10%10==i%10){
                        b++;
                    }
                }
                if(strike[j]!=s||ball[j]!=b){
                    break;
                }
                check++;
                if(check==N){
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}