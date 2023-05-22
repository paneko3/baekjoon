// BOJ_5635_생일

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_5635 {
    static class Person implements Comparable<Person>{
        String name;
        int d,m,y;
        public Person(String name, int d, int m, int y) {
            this.name = name;
            this.d = d;
            this.m = m;
            this.y = y;
        }
        public int compareTo(Person o){
            if(this.y == o.y){
                if(this.m == o.m){
                    return o.d - this.d;
                }else {
                    return o.m - this.m;
                }
            }else {
                return o.y - this.y;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Person[] people = new Person[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            people[i]=new Person(name,d,m,y);
        }
        /* ==========sol========== */
        Arrays.sort(people);
        /* ==========output========== */
        System.out.println(people[0].name);
        System.out.println(people[N-1].name);
        br.close();
    }
}