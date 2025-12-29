// BOJ_1713_후보 추천하기

import java.io.*;
import java.util.*;

public class BOJ_1713 {
    static class Student implements Comparable<Student> {
        int id, cnt, time;
        public Student(int id, int cnt, int time) { this.id = id; this.cnt = cnt; this.time = time; }
        @Override
        public int compareTo(Student o) {
            if (this.cnt == o.cnt) { return this.time - o.time; }
            return this.cnt - o.cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* ==========sol========== */
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int id = Integer.parseInt(st.nextToken());
            boolean check = false;
            for (Student s : list) {
                if (s.id == id) {
                    s.cnt++;
                    check = true;
                    break;
                }
            }
            if (!check) {
                if (list.size() == n) {
                    Collections.sort(list);
                    list.remove(0);
                }
                list.add(new Student(id, 1, i));
            }
        }
        Collections.sort(list, (o1, o2) -> o1.id - o2.id);
        /* ==========output========== */
        StringBuilder result = new StringBuilder();
        for (Student s : list) { result.append(s.id).append(" "); }
        System.out.println(result);
        br.close();
    }
}
