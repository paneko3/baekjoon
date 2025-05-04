// BOJ_6764_Sounds fishy!

import java.io.*;

public class BOJ_6764 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /* ==========sol========== */
        boolean flag1 = arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]; // Rising
        boolean flag2 = arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3]; // Diving
        boolean flag3 = arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]; // Constant

        String result;
        if (flag1) {
            result = "Fish Rising";
        } else if (flag2) {
            result = "Fish Diving";
        } else if (flag3) {
            result = "Fish At Constant Depth";
        } else {
            result = "No Fish";
        }

        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}