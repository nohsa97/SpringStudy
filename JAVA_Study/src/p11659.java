import java.io.*;
import java.util.StringTokenizer;

public class p11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter brw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N,M,arrs;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arr [] = new int[N + 1];
        arr[0] = 0;
        for(int i = 1; i <= N; i++)
        {
            arrs = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + arrs;
        }

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ans = arr[b] - arr[a-1];
            System.out.println(ans);
        }
    }
}
