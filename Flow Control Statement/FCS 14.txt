import java.util.Scanner;
public class FCS14{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        int a,s,r;
        a=input.nextInt();
        s=0;
        while(a>0){
        r=a%10;
        s=s+r;
        a=a/10;
        r=0;
        }
System.out.print(s);
    }
}