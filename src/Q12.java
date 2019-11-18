import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        char c=sn.next().charAt(0);
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
