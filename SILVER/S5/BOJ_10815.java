// BOJ_10815_숫자 카드

import java.io.*;
import java.util.*;

public class BOJ_10815 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            card[i]= Integer.parseInt(st.nextToken());
        }
		/* ==========sol========== */
        Arrays.sort(card);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            int temp = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = N-1;
            boolean flag = false;
            while (left<=right){
                int mid=(left+right)/2;
                if(card[mid]==temp){
                	flag = true;
                    break;
                }
                if(card[mid]>temp){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
            sb .append(flag?"1 ":"0 ");
        }
		/* ==========output========== */
        System.out.println(sb.toString().trim());
		br.close();
	}
}