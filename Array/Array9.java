import java.util.Scanner;
public class Array9{
    public static void main(String[]test){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            a[i]=input.nextInt();
        }
        int b[]=new int[n];
        int j=0;
        int r=n-1;
        for (int i=0;i<n;i++){
        if(a[i]!=10){
            b[j]=a[i];
            j+=1;
            }
        else if(a[i]==10){
            b[r]=0;
            r-=1;
        }
        }
        System.out.print("{");
        for(int i=0;i<n;i++){
            System.out.print(b[i]);
            if(i<n-1){
            System.out.print(",");
            }
            else{
                System.out.print("}");
            }
        }
}
}