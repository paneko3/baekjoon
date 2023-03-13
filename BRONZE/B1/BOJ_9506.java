// BOJ_9506_약수들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            if(n==-1){
                break;
            }
            int temp = 0;
            ArrayList<Integer> list = new ArrayList<>();
            boolean[] check = new boolean[n+1];
            for(int i=1;i<n;i++){
                if((n%i)==0){
                    temp +=i;
                    list.add(i);
                }
                if(temp>n){
                    break;
                }
            }
            /* ==========output========== */
            StringBuilder sb = new StringBuilder();
            if(temp==n){
                sb.append(n).append(" = ");
                for (int num : list){
                    sb.append(num).append(" + ");
                }
                sb.setLength(sb.length()-3);
            }else {
                sb.append(n).append(" is NOT perfect.");
            }
            System.out.println(sb);

        }
        br.close();
    }
}
