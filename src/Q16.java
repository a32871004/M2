import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(int) Math.pow(2,i);
        }
        System.out.println(sum);
    }
}
