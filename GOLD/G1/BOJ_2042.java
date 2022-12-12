// BOJ_2042_구간 합 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2042 {
    static long[] num,tree;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        num = new long[N+1];
        for(int i=1;i<=N;i++){
            num[i]=Long.parseLong(br.readLine());
        }
        tree = new long[N*4];
        init(1,N,1);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<M+K;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            if(a==1){
                long dif = c - num[b];
                num[b]=c;
                update(1,N,1,b,dif);
            }else if(a==2){
                sb.append(sum(1,N,1,b,(int)c)).append("\n");
            }
        }
        /* ==========output========== */
        System.out.println(sb.toString());
        br.close();
    }
    static long init(int start, int end, int node){
        if(start == end) {
            return tree[node] = num[start];
        }
        int mid = (start+end) / 2;
        return tree[node] = init(start,mid,node*2)+init(mid+1,end,node*2+1);
    }
    static void update(int start, int end, int node, int idx, long dif){
        if(idx<start || idx>end){
            return;
        }
        tree[node] +=dif;
        if(start==end){
            return;
        }
        int mid = (start+end)/2;
        update(start,mid,node*2,idx,dif);
        update(mid+1,end,node*2+1,idx,dif);
    }
    static long sum(int start, int end, int node, int left, int right){
        if(right<start || left>end){
            return 0;
        }
        if(left<=start && right>=end){
            return tree[node];
        }
        int mid = (start+end)/2;
        return sum(start,mid,node*2,left,right) +sum(mid+1,end,node*2+1,left,right);
    }
}
