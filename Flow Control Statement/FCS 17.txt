import java.util.Scanner;
public class FCS17{
    public static void main(String[]test){
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int s=a;
     int b =0;
     int rem =0;
    while(a>0){
    rem=a%10;//2
    b=b*10 ;//30
    b+=rem;//30
    a=a/10;//12
}
if(b==s){
    System.out.print(s+"is a palindrome");
}
else{
    System.out.print(s+"is not a palindrome");
}
}
}