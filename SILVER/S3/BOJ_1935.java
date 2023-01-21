// BOJ_1935_후위 표기식2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1935 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        double[] num = new double[N];
        for (int i = 0; i < N; i++) {
            num[i] = Double.parseDouble(br.readLine());
        }
        /* ==========sol========== */
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                stack.push(num[c-'A']);
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                if (c == '+') {
                    stack.push(num2+num1);
                } else if (c == '-') {
                    stack.push(num2-num1);
                } else if (c == '/') {
                    stack.push(num2/num1);
                } else if (c == '*') {
                    stack.push(num2*num1);
                }
            }
        }
        /* ==========output========== */
        System.out.println(String.format("%.2f",stack.pop()));
        br.close();
    }
}
