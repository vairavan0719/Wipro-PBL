import java.util.Scanner;
public class Array7{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            a[i]=input.nextInt();
        }
        int c[]= new int[10];
        int f=a[0];
        c[0]=a[0];
        int j=1;
        for(int i=1;i<n;i++){
            if(a[i]!=f){
                c[j]=a[i];
                j+=1;
            }
        }
        System.out.print("{");
        for(int i=0;i<=(j);i++){
             if (i<=(j-2)){
            System.out.print(c[i]+",");
            }
            else if (i<(j)){
                System.out.print(c[i]+"}");
            } 
            
                
            }
        }
    
}