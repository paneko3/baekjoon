// BOJ_1644_소수의 연속합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1644 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        List<Integer> list = new ArrayList<>();
        boolean[] check=new boolean[N+1];
        for(int i=2;i<=N;i++){
            if(!check[i]){
                list.add(i);
                for(int j=i;j<=N;j+=i){
                    check[j]=true;
                }
            }
        }
        int result=0;
        int left=0;
        int right=0;
        int sum=0;
        while (true){
            if(sum>=N){
                sum-=list.get(left++);
            }else if(right == list.size()){
                break;
            }else {
                sum+=list.get(right++);
            }
            if(N==sum){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
