import java.util.Scanner;
public class Array11{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int a =input.nextInt();
            int b[]= new int[a];
            for (int i =0;i<a;i++){
                System.out.print("Enter a number: ");
                b[i]=input.nextInt();
            }
            int count=0;
            for (int i =0;i<a;i++){
                if(b[i]!=4 && b[i]!=1 ){
                    count+=1;
                    System.out.print("False");
                    break;
                }
            }
            if(count==0){
            System.out.print("True");
            }
                
            }
}