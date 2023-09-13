// BOJ_5218_알파벳 거리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < numCases; i++) {
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            /* ==========sol========== */
            ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
            System.out.print("Distances: ");
            for(Integer d : answer) {
                System.out.print(d+" ");
            }
            /* ==========output========== */
            System.out.println();
        }
        br.close();
    }
    static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<s1.length();i++){
            int num1 = s1.charAt(i);
            int num2 = s2.charAt(i);
            answer.add(num1<=num2?num2-num1:26+(num2-num1));
        }
        return answer;
    }
}