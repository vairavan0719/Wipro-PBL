import java.util.Scanner;
public class Array13{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        int a [][]= new int[2][2];
    for (int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print("Enter a number:");
            a[i][j]=input.nextInt();
    
        }
        }
        for (int i=1;i>=0;i--){
        for(int j=1;j>=0;j--){
            System.out.print(a[i][j]+" ");
    
        }
        System.out.print("\n");
        }
        
    }
}