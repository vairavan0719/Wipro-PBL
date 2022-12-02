import java.util.Scanner;
public class FCS4{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        char a =input.next().charAt(0);
        char b = input.next().charAt(0);
        int ch1= a;
        int ch2 =b;
    if(ch2>ch1){
        System.out.print(a+","+b);
    }
    else{
        System.out.print(b+","+a);
    }
    
    }
}