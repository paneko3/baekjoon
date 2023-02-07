// BOJ_2357_최솟값과 최댓값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2357 {
    static int[] num, minTree, maxTree;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        num = new int[N+1];
        minTree = new int[N*4];
        maxTree = new int[N*4];
        for(int i=1;i<=N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        minInit(1,N,1);
        maxInit(1,N,1);
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            /* ==========output========== */
            System.out.println(minFind(1,N,1,a,b) + " " + maxFind(1,N,1,a,b));
        }
        br.close();
    }
    static int minInit(int start, int end, int node){
        if(start==end){
            return minTree[node]=num[start];
        }
        int mid = (start+end) / 2;
        return minTree[node] = Math.min(minInit(start,mid,node*2),minInit(mid+1,end,node*2+1));
    }
    static int maxInit(int start, int end, int node){
        if(start==end){
            return maxTree[node]=num[start];
        }
        int mid = (start+end) / 2;
        return maxTree[node] = Math.max(maxInit(start,mid,node*2),maxInit(mid+1,end,node*2+1));
    }
    static int minFind(int start, int end, int node, int left, int right){
        if(right<start || left>end){
            return Integer.MAX_VALUE;
        }
        if(left<=start && right>=end){
            return minTree[node];
        }
        int mid = (start + end) / 2;
        return Math.min(minFind(start,mid,node*2,left,right),minFind(mid+1,end,node*2+1,left,right));
    }
    static int maxFind(int start, int end, int node, int left, int right){
        if(right<start || left>end){
            return Integer.MIN_VALUE;
        }
        if(left<=start && right>=end){
            return maxTree[node];
        }
        int mid = (start + end) / 2;
        return Math.max(maxFind(start,mid,node*2,left,right),maxFind(mid+1,end,node*2+1,left,right));
    }
}
