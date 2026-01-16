// BOJ_30676_이 별은 무슨 색일까

import java.io.*;
import java.util.*;

public class BOJ_30676 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lambda = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        String result = "";
        if (lambda >= 620 && lambda <= 780) {
            result = "Red";
        } else if (lambda >= 590) {
            result = "Orange";
        } else if (lambda >= 570) {
            result = "Yellow";
        } else if (lambda >= 495) {
            result = "Green";
        } else if (lambda >= 450) {
            result = "Blue";
        } else if (lambda >= 425) {
            result = "Indigo";
        } else if (lambda >= 380) {
            result = "Violet";
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
