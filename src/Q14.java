import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i*(i+1);
        }
        System.out.println(sum);
    }
}
