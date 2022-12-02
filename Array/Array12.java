import java.util.Scanner;
public class Array12{
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
            int a =3;
            int b[]= new int[a];
            for (int i =0;i<a;i++){
                System.out.print("Enter a number: ");
                b[i]=input.nextInt();
            }
            int c=3;
            int d[]= new int[c];
            for (int i =0;i<c;i++){
                System.out.print("Enter a number: ");
                d[i]=input.nextInt();
            }
            int f1=2;
            int f[]= new int[f1];
            for (int i =0;i<a;i++){
                if(i==1){
                    f[0]=b[i];
            }
            }

                for (int i =0;i<c;i++){
                if(i==1){
                    f[1]=d[i];
            }
            }
            System.out.print("[");
            for (int i =0;i<2;i++){
                if(i<1){
                    System.out.print(f[i]+",");
                }
                else{
                    System.out.print(f[i]+"]");
                }
            
                    
                }
            

}
}