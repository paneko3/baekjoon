// BOJ_1235_학생 번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_1235 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
        }
        /* ==========sol========== */
        int len = arr[0].length();
        Loop :for(int i=1;i<=len;i++){
            HashSet<String> set = new HashSet<>();
            for(int j=0;j<N;j++){
                String str = arr[j].substring(len-i,len);
                if(set.contains(str)){
                    continue Loop;
                }else {
                    set.add(str);
                }
            }
            /* ==========output========== */
            System.out.println(i);
            return;
        }
        br.close();
    }
}