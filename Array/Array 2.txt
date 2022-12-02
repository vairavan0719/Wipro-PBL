import java.util.Scanner;
public class Array2{
public static void main(String[]test){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of the array :");
    int u =input.nextInt();
    int a[]= new int[u+1];
    for (int i=0;i<u;i++){
        System.out.print("Enter a number:");
        a[i]=input.nextInt();
    }
    int max ,min;
    max=a[0];
    min=a[0];
    for (int i=0;i<u;i++){
        if(a[i]>max){
            max=a[i];
            }
    }
    for (int i=0;i<u;i++){
        if(a[i]<min){
            min=a[i];
        }
        }
    System.out.print("Maximum: "+max+"\n");
    System.out.print("Minimum: " +min);
}
}