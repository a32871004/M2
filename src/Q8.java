import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=0;
        for (int i=3;i<=n;i=i+3){
            sum+=i;
        }
        System.out.println(sum);
    }
}
