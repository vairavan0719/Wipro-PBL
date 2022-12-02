import java.util.Scanner;
public class Array1{
public static void main(String[]test){
    int s;
    s=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of the array :");
    int u =input.nextInt();
    int a[]= new int[u+1];
    for (int i=0;i<u;i++){
        System.out.print("Enter a number:");
        a[i]=input.nextInt();
    }
    for (int i=0;i<=u;i++){
        s+=a[i];
    }
    System.out.print("Sum of the given array is: "+s+"\n");
    System.out.print("Average of the given array is: " +s/u);
}
}