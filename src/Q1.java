import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        float n=sn.nextFloat();
        float max=n;
        float min=n;
        for (int i=1;i<10;i++){
            n=sn.nextFloat();
            if(n>max){
                max=n;
            }
            if (n<min){
                min=n;
            }
        }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);
    }
}
