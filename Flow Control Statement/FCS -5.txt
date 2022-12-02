import java.util.Scanner;
public class FCS5{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        int b= (char)a;
        if((b>=97 && b<=122)||(b>=65 && b<=98)){
            System.out.print("Alphabet");
        }
        else if(b>=48 && b<=57){
            System.out.print("Digit");
        }
        else{
            System.out.print("Special Character");
        }
        
    }
    
    
}