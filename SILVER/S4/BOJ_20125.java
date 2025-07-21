// BOJ_20125_쿠키의 신체 측정

import java.io.*;

public class BOJ_20125 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        /* ==========sol========== */
        int heartX = -1, heartY = -1;
        outer:
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N - 1; j++) {
                if (map[i][j] == '*' &&
                    map[i - 1][j] == '*' &&
                    map[i][j - 1] == '*' &&
                    map[i][j + 1] == '*' &&
                    map[i + 1][j] == '*') {
                    heartX = i;
                    heartY = j;
                    break outer;
                }
            }
        }
        int leftArm = 0;
        for (int j = heartY - 1; j >= 0 && map[heartX][j] == '*'; j--) {
            leftArm++;
        }
        int rightArm = 0;
        for (int j = heartY + 1; j < N && map[heartX][j] == '*'; j++) {
            rightArm++;
        }
        int waist = 0, waistEnd = heartX + 1;
        for (int i = heartX + 1; i < N && map[i][heartY] == '*'; i++) {
            waist++;
            waistEnd = i;
        }
        int leftLeg = 0;
        for (int i = waistEnd + 1; i < N && map[i][heartY - 1] == '*'; i++) {
            leftLeg++;
        }
        int rightLeg = 0;
        for (int i = waistEnd + 1; i < N && map[i][heartY + 1] == '*'; i++) {
            rightLeg++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((heartX + 1)).append(" ").append((heartY + 1)).append("\n");
        sb.append(leftArm).append(" ").append(rightArm).append(" ");
        sb.append(waist).append(" ").append(leftLeg).append(" ").append(rightLeg);
        System.out.println(sb);
    }
}
