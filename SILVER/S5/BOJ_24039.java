// BOJ_24039_2021은 무엇이 특별할까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_24039 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        ArrayList<Integer> list = new ArrayList<>();
        int i,j;
        for(i=2;i<=10000;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                list.add(i);
            }
        }
        /* ==========output========== */
        for(i=0;i<list.size();i++){
            if(list.get(i)*list.get(i+1)>N){
                System.out.println(list.get(i)*list.get(i+1));
                break;
            }
        }
        br.close();
    }
}