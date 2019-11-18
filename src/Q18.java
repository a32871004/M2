import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n=sn.nextInt();
        boolean flag=false;
        int sum;
        for (int i=1;i<=n/2;i++){
            sum=0;
            for (int j=i;j<=n;j++){
                sum=sum+j;
                if (sum==n){
                    flag=true;
                    for (int k=i;k<j;k++){
                        System.out.print(k+"+");
                    }
                    System.out.println(j);
                    break;
                }
            }
        }
        if (flag==false){
            System.out.println("No");
        }
    }
}