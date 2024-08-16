// BOJ_6825_Body Mass Index

import java.io.*;

public class BOJ_6825 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double w = Double.parseDouble(br.readLine());
		double h = Double.parseDouble(br.readLine());
		double BMI = w/(h*h);
		/* ==========sol========== */
		/* ==========output========== */
		if(BMI>25) {
			System.out.println("Overweight");
		}else if(BMI>18.5) {
			System.out.println("Normal weight");
		}else {
			System.out.println("Underweight");
		}
		br.close();
	}
}
