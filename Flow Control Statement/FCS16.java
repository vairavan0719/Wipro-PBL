import java.util.Scanner;
public class FCS16{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        int a,s,r;
        a=input.nextInt();
        s=0;
        while(a>0){
        r=(a%10);
        s=(s*10)+r;
        a=a/10;
        }
System.out.print(s);
    }
}