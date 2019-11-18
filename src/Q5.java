import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n=sn.nextInt();
        String str="";
        while (n>0){
            str=Integer.toString(n%2)+str;
            n/=2;
        }
        System.out.printf("%08d\n",Integer.parseInt(str));
    }
}