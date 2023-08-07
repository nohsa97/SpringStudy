import java.util.Scanner;

public class p11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int N = sc.nextInt();
        String M = sc.next();
        char ar[] = M.toCharArray();

        for(int i = 0; i < ar.length; i++)
        {
            result += (int)ar[i] - '0';
        }
        System.out.println(result);
    }
}
