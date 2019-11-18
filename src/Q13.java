import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        long f=1;
        for (int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println(f);
    }
}
