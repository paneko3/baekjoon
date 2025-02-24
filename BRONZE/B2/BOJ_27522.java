// BOJ_27522_카트라이더: 드리프트

import java.io.*;
import java.util.*;

public class BOJ_27522 {
	static int r = 0;
    static int b = 0;
    static int[] score = {10, 8, 6, 5, 4, 3, 2, 1, 0};
    static PriorityQueue<Time> q = new PriorityQueue<>();
	static class Time implements Comparable<Time> {
        int M;
        int SS;
        int sss;
        String team;
        public Time(int m, int SS, int sss, String team) {
            M = m;
            this.SS = SS;
            this.sss = sss;
            this.team = team;
        }
        @Override
        public int compareTo(Time o) {
            if (M == o.M) {
                if (SS == o.SS) {
                    return sss - o.sss;
                }
                return SS - o.SS;
            }
            return M - o.M;
        }
    }
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < 8; i++) {
            st = new StringTokenizer(br.readLine(), ":");
            int m = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());
            String temp = st.nextToken();
            int sss = Integer.parseInt(temp.substring(0, 3));
            String team = temp.substring(temp.length() - 1);
            q.offer(new Time(m, ss, sss, team));
        }
		/* ==========sol========== */
        int size = q.size();
        for (int i = 0; i < size; i++) {
            Time temp = q.poll();
            if(temp.team.equals("R")) {
                r += score[i];
            } else {
                b += score[i];
            }
        }
        if (r > b) {
            sb.append("Red");
        } else {
            sb.append("Blue");
        }
		/* ==========output========== */
        System.out.println(sb);
		br.close();
	}
}
