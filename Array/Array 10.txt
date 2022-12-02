import java.util.Scanner;
public class Array10{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int a =input.nextInt();
            int n=a;
            int b[]= new int[a];
            for (int i =0;i<n;i++){
                System.out.print("Enter a number: ");
                b[i]=input.nextInt();
            }
            int c[]= new int[a];
            int j=0;
            for(int i=0;i<n;i++){
                if(b[i]%2==0){
                    c[j]=b[i];
                    j+=1;
                }
                else if(b[i]%2!=0){
                    c[a-1]=b[i];
                    a-=1;
                }
            
                
            }
            System.out.print("[");
            for(int i=0;i<n;i++){
                if(i<(n-1)){
                System.out.print(c[i]+",");
                }
                else{
                    System.out.print(c[i]+"]");
                }
            }
    }
}