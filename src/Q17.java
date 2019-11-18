import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=0;
        int total=0;
        while (n>0){
            sum=sum+n%10;
            n/=10;
            total++;
        }
        System.out.println(total);
        System.out.println(sum);
    }
}
