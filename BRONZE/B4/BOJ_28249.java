// BOJ_28249_Chili Peppers

import java.io.*;
import java.util.*;

public class BOJ_28249 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> pepperSHU = new HashMap<>();
        pepperSHU.put("Poblano", 1500);
        pepperSHU.put("Mirasol", 6000);
        pepperSHU.put("Serrano", 15500);
        pepperSHU.put("Cayenne", 40000);
        pepperSHU.put("Thai", 75000);
        pepperSHU.put("Habanero", 125000);
        int result = 0;
		/* ==========sol========== */
		for (int i = 0; i < N; i++) {
            String pepper = br.readLine();
            result += pepperSHU.get(pepper);
        }
		/* ==========output========== */
        System.out.println(result);
		br.close();
	}
}