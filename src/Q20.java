import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        for(int i=2;i<n;i++){
            int p=2;
            int count=0;
            while (p <= i / 2) {
                if (i%p==0){
                    count++;
                }
                p++;
            }
            if (count==0){
                System.out.println(i);
            }
        }
    }
}