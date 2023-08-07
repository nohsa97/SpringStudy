import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p12891 {
    static int check[];
    public static void main(String[] args) throws IOException {

        int S, P;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        check = new int[P];

        char arr[] = new char[S];
        arr = br.readLine().toCharArray();


        for (int i = 0; i < P; i++){
            add(arr[i]);
        }

    }


    static void add(char c){
        switch (c){
            case 'A':
                check[0]++;
                break;
            case 'C':
                check[1]++;
                break;
            case 'G':
                check[2]++;
                break;
            case 'T':
                check[3]++;
                break;
        }
    }


}
