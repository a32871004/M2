import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int sum = 0;
        for (int i=0;i<=n;i++){
            sum+=i;
            if (sum>n){
                System.out.println(i-1);
                break;
            }
        }
    }
}
