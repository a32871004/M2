import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        double n=sn.nextInt();
        double sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+1.0/((2*i-1)*(2*i));
        }
        System.out.println(sum);
    }
}
