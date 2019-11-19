import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        while (n>0){
            System.out.print(n%10);
            n/=10;
        }
        System.out.println();
    }
}
