// BOJ_5032_탄산 음료

import java.io.*;
import java.util.*;

public class BOJ_5032 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int e = Integer.parseInt(input[0]); 
        int f = Integer.parseInt(input[1]); 
        int c = Integer.parseInt(input[2]); 

        /* ==========sol========== */
        int totalEmpty = e + f;
        int drinks = 0;

        while (totalEmpty >= c) {
            int newDrinks = totalEmpty / c;
            drinks += newDrinks;
            totalEmpty = newDrinks + (totalEmpty % c); 
        }

        /* ==========output========== */
        System.out.println(drinks);
		br.close();
	}
}