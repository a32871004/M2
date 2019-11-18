import java.math.BigInteger;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        BigInteger total=new BigInteger("1");
        int enter=0;
        for (int i=n;i>1;i--){
            total=total.multiply(new BigInteger(Integer.toString(i)));
        }
        while (total.mod(new BigInteger("10")).intValue()==0){
            enter++;
            total=total.divide(new BigInteger("10"));
        }
        System.out.println(enter);
    }
}
