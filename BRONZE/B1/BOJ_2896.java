// BOJ_2896_무알콜 칵테일

import java.io.*;
import java.util.*;

public class BOJ_2896 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		double I = Double.parseDouble(st.nextToken());
		double J = Double.parseDouble(st.nextToken());
		double K = Double.parseDouble(st.nextToken());
		/* ==========sol========== */
		double min = A/I<B/J?A/I:B/J;
		min = min < C/K?min:C/K;
		/* ==========output========== */
		System.out.printf("%.4f %.4f %.4f",A-min*I,B-min*J,C-min*K);
		br.close();
	}
}
