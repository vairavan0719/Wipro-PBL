import java.util.Scanner;
public class Array5{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = input.nextInt();
        int b[]= new int[a];
        for (int i=0;i<a;i++){
            System.out.print("Enter a number: ");
            b[i]=input.nextInt();
        }
       int f[]=new int[a];
        int max=b[0];
        int c=0;
        for (int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(max<b[j]){
                    max=b[j];
                    c=j;
            }
        }
         b[c]=0;
        f[i]=max;
        max=0;
     

    }
    System.out.print("Largest two digits are: "+ f[0]+","+f[1]+"\n");
    System.out.print("Smallest two digits are: "+f[a-1]+","+f[a-2]);
    
}
}