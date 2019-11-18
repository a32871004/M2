import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int x=sn.nextInt();
        int y=sn.nextInt();
        int xy=1;
        for (int i=x;i>1;i--){
            if (x%i==0&&y%i==0){
                xy=i;
                break;
            }
        }
        System.out.println(xy);
        System.out.println((x*y)/xy);
    }
}
