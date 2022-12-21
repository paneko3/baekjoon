// BOJ_1976_여행 가자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1976 {
    static int[] parents;
    static int findParent(int x){
        if(parents[x]==x){
            return parents[x]=x;
        }else {
            return findParent(parents[x]);
        }
    }
    static void union(int a,int b){
        a=findParent(a);
        b=findParent(b);
        if(a!=b){
            if(a>b){
                parents[a]=b;
            }else {
                parents[b]=a;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        parents = new int[N+1];
        for(int i=1;i<=N;i++){
            parents[i]=i;
        }
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                if(Integer.parseInt(st.nextToken())==1){
                    union(i,j);
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int start = findParent(Integer.parseInt(st.nextToken()));
        for(int i=1;i<M;i++){
            int now = Integer.parseInt(st.nextToken());
            if(start != findParent(now)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        br.close();
    }
}
