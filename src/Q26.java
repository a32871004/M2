import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int k=n;
        while (n>=3){
            k+=n/3;
            n=n/3+n%3;
        }
        System.out.println(k);
    }
}
