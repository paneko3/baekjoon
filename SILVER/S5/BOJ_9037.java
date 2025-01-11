// BOJ_9037_The candy war

import java.io.*;
import java.util.*;

public class BOJ_9037 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				int num = Integer.parseInt(st.nextToken());
				arr[i]=num%2==0?num:num+1;
			}
			int result = 0;
			while(true) {
				for(int i=0;i<N;i++) {
					arr[i]=arr[i]%2==0?arr[i]:arr[i]+1;
				}
				int temp = arr[0];
				boolean flag = false;
				for(int i=1;i<N;i++) {
					if(temp!=arr[i]) {
						flag = true;
					}
				}
				if(!flag) {
					break;
				}
				result++;
				int[] newArr = new int[N];
				for(int i = 0; i < N; i++){
					newArr[(i + 1) % N] = arr[i] / 2 + arr[(i + 1) % N] / 2; // 맨끝에 있는 학생은 맨 처음의 한생으로 줘야 하기 때문에 뒤에 길이 만 큼 나눈 나머지로 해야 한다.
				}
				arr = newArr;
			}
			System.out.println(result);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
