// BOJ_13335_트럭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13335 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int w =Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        int[] a= new int[n];
        int[] bridge = new int[w];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result=0;
        int cur=0;
        int index=0;
        while (index<n){
            int temp = bridge[0];
            for(int i=1;i<w;i++){
                bridge[i-1] = bridge[i];
            }
            bridge[w-1]=0;
            if(temp!=0){
                cur-=temp;
            }
            if(index<n&&cur+a[index]<=L){
                bridge[w-1]=a[index];
                cur+=a[index];
                index++;
            }
            result++;
        }
        /* ==========output========== */
        System.out.println(result+w);
        br.close();
    }
}
