import java.util.Scanner;
public class FSC2{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a =input.nextInt();
    if(a%2==0){
        System.out.print(a+" It is even number");
    }
    else{
        System.out.print(a+" It is odd number");
    }
    
    }
    
}