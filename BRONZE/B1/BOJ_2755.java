// BOJ_2755_이번학기 평점은 몇점?

import java.io.*;
import java.util.*;

public class BOJ_2755 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 성적 -> 평점 매핑
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.3);
        gradeMap.put("A0", 4.0);
        gradeMap.put("A-", 3.7);
        gradeMap.put("B+", 3.3);
        gradeMap.put("B0", 3.0);
        gradeMap.put("B-", 2.7);
        gradeMap.put("C+", 2.3);
        gradeMap.put("C0", 2.0);
        gradeMap.put("C-", 1.7);
        gradeMap.put("D+", 1.3);
        gradeMap.put("D0", 1.0);
        gradeMap.put("D-", 0.7);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0;
        int totalCredit = 0;

        /* ==========sol========== */
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int credit = Integer.parseInt(st.nextToken());
            String grade = st.nextToken();

            double gradePoint = gradeMap.get(grade);

            totalScore += credit * gradePoint;
            totalCredit += credit;
        }

        double average = totalScore / totalCredit;

        /* ==========output========== */
        System.out.printf("%.2f\n", average);
		br.close();
	}
}