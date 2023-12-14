// BOJ_7490_0 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_7490 {
    static int N;
    static char[] arr;
    static ArrayList<String> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            N = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            arr = new char[N-1];
            list = new ArrayList<>();
            subset(0);
            Collections.sort(list);
            /* ==========output========== */
            for(String s:list){
                System.out.println(s);
            }
            System.out.println();
        }
        br.close();
    }
    static void subset(int count){
        if(count==N-1){
            String str = "";
            for (int i=0;i<N-1;i++){
                if(arr[i]==' '){
                    str += (i+1);
                    continue;
                }
                str += (i+1);
                str += arr[i];
            }
            str += N;
            String[] tokens = str.split("[+,-]");
            int result = Integer.parseInt(tokens[0]);
            int idx = 1;
            for(int i=0;i<N-1;i++){
                if(arr[i]==' '){
                    continue;
                }
                result = arr[i]=='+'?result+Integer.parseInt(tokens[idx]):result-Integer.parseInt(tokens[idx]);
                idx++;
            }
            if(result==0){
                String s = "";
                for(int i=0;i<N-1;i++){
                    s+=i+1;
                    s+=arr[i];
                }
                s+=N;
                list.add(s);
            }
            return;
        }
        arr[count]='+';
        subset(count+1);
        arr[count]='-';
        subset(count+1);
        arr[count]=' ';
        subset(count+1);
    }
}