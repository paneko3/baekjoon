// BOJ_6588_골드바흐의 추측

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6588 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] num = new boolean[1000001];
        num[0]=num[1]=true;
        for(int i=2;i<1000001;i++){
            if(!num[i]){
                for(int j=i+i;j<1000001;j+=i){
                    num[j]=true;
                }
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0) break;
            boolean flag=false;
            for(int i=3;i<=n;i+=2){
                if(!num[i]&&!num[n-i]){
                    System.out.println(n+" = " + i+" + " + (n-i));
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
        br.close();
    }
}
