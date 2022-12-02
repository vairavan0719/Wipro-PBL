import java.util.Scanner;
public class Array4{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = input.nextInt();
        int b[]= new int[a];
        String s="";
        for (int i=0;i<a;i++){
            System.out.print("Enter a number: ");
            b[i]=input.nextInt();
            s+=((char)b[i]);
        }
    System.out.print(s);    

    }
}