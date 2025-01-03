// BOJ_30454_얼룩말을 찾아라!

import java.io.*;
import java.util.*;

public class BOJ_30454 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		int max = 0;
		for(int i=0;i<N;i++){
			int count=0;
            String str = br.readLine();
            for(int j=0;j<L;j++){
                if(str.charAt(j) == '1'){
                    if(j==0){
                    	count++;
                    }else{
                        if(str.charAt(j-1)=='0'){
                        	count++;
                        }
                    }
                }
            }
            if(max<count){
                max = count;
                result = 1;
            }else if(max == count){
            	result++;
            }
        }
		/* ==========output========== */
		System.out.println(max+ " "+result);
		br.close();
	}
}
