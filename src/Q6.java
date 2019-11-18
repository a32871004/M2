import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int p=2;
        int total=0;
        while (p<=n/2){
            if(n%p==0){
                total++;
            }
            p++;
        }
        if (total==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}