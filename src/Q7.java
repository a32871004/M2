import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int listen,read,say,total;
        for (int i=1;i<=n;i++){
            total=0;
            listen=sn.nextInt();
            read=sn.nextInt();
            say=sn.nextInt();
            if(listen<60){
                total++;
            }
            if(read<60){
                total++;
            }
            if(say<60){
                total++;
            }
            if(total==0){
                System.out.println("P");
            }
            else if(total==1){
                if (listen+read+say>=220) {
                    System.out.println("P");
                }
                else {
                    System.out.println("M");
                }
            }
            else if(total==2){
                if(listen>=80||read>=80||say>=80){
                    System.out.println("M");
                }
                else {
                    System.out.println("F");
                }
            }
            else {
                System.out.println("F");
            }
        }
    }
}
