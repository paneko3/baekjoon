// BOJ_2959_거북이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2959 {
	
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[4];
		
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		/* ==========sol========== */
		
		Arrays.sort(arr);
		
		// 정렬된 네 길이: arr[0] <= arr[1] <= arr[2] <= arr[3]
		// 네 길이를 두 쌍 (L1, L3)와 (L2, L4)로 나누어 직사각형 면적 min(L1, L3) * min(L2, L4)를 최대화한다.
		// 최대 면적은 가장 작은 길이(arr[0])와 세 번째로 작은 길이(arr[2])를 곱한 값이다.
		
		/* ==========output========== */
		System.out.println(arr[0] * arr[2]);
	}

}
