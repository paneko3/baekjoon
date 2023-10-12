// BOJ_5568_카드 놓기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_5568 {
    static HashSet<String> set;
    static int n,k;
    static String[] input, arr;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        input = new String[n];
        for(int i=0;i<n;i++){
            input[i]=br.readLine();
        }
        /* ==========sol========== */
        set = new HashSet<>();
        arr = new String[k];
        per(0,new boolean[n]);
        /* ==========output========== */
        System.out.println(set.size());
        br.close();
    }
    static void per(int count,boolean[] check){
        if(count==k){
            String str = "";
            for(int i=0;i<k;i++){
                str+=arr[i];
            }
            set.add(str);
            return;
        }
        for(int i=0;i<n;i++){
            if(check[i]){
                continue;
            }
            arr[count]=input[i];
            check[i]=true;
            per(count+1,check);
            check[i]=false;
        }
    }
}