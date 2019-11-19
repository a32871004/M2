import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=0,j;
        boolean flag=true;
        for (int i=2;i<=n;i++){
            j=i;
            for (;j!=1;){
                if (j%2==0){
                    j/=2;
                }
                else if(j%3==0){
                    j/=3;
                }
                else if (j%5==0){
                    j/=5;
                }
                else {
                    flag=false;
                    break;
                }
            }
            if(flag)sum+=i;
            flag=true;
        }
        System.out.println(sum);
    }
}