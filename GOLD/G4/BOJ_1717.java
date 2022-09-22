// BOJ_1717_집합의 표현

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1717 {
    static int n, m;
    static int[] parent;
    static int findParent(int x){
        if(parent[x]==x) return x;
        else return parent[x]=findParent(parent[x]);
    }
    static void union(int a,int b){
        a=findParent(a);
        b=findParent(b);
        if(a>b){
            parent[b]=a;
        }else {
            parent[a]=b;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parent= new int[n+1];
        for(int i=0;i<=n;i++){
            parent[i]=i;
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(op==0){
                union(a,b);
            }else {
                if(findParent(a)==findParent(b)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
        br.close();
    }
}
