import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=1;
        for (int i=0;i<=n;i++){
            sum=sum+i;
            System.out.printf("%d\t",sum);
            if (sum>n)
                break;
        }
        System.out.println();
        for (int i=1;i<=n+1;i++){
            for (int j=1;j<=i;j++)
                System.out.printf("%d\t",i);
        }
        System.out.println();
    }
}
