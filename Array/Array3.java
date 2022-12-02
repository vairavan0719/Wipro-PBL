import java.util.Scanner;
public class Array3{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = input.nextInt();
        int b[]= new int[a];
        for (int i=0;i<a;i++){
            System.out.print("Enter a number: ");
            b[i]=input.nextInt();
        }
        System.out.print("Enter the number to find:");
        int c = input.nextInt();
        int count=0;
        for (int i=0;i<a;i++){
            if(b[i]==c){
                count+=1;
                System.out.print("The index value of the given number is: "+ i);
            }
            
            }
            if(count==0){
                System.out.print("The index value of the given number is: -1");
            }
                
        }
        }
    

