import java.util.Scanner;
public class Array14{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int b=input.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=input.nextInt();
        if(b==3 && c==3){
        int a [][]= new int[b][c];
    for (int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("Enter a number:");
            a[i][j]=input.nextInt();
    
        }
        }
        int max=a[0][0];
        for (int i=1;i<3;i++){
        for(int j=1;j<3;j++){
            if(max<a[i][j]){
                max=a[i][j];
            }
    
        }
        }
        System.out.print("Biggest number in the array is:"+max);
        }
        else{
            System.out.print("Enter 9 integers");
        }
    }
}