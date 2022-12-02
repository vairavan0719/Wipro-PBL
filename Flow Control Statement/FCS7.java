import java.util.Scanner;
public class FCS7{
    public static void main(String[]test){
    Scanner input = new Scanner(System.in);
    char a = input.next().charAt(0);
    int b;
    b = (char)a;
    if(b>=97 && b<=122){
    b=b-32;
    System.out.print((char)b);
    }
    else if(b>=65 && b<=90){
    b=b+32;
    System.out.print((char)b);
    }
}
}