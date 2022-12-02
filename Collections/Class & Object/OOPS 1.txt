import java.util.Scanner;
public class Oops1 {
    int width;
    int height;
    int depth;
    public Main(){
    width =5;
    height=5;
    depth =5;

    }
    
   
    public void volume(){
        System.out.print("Volume of the box is: "+(width*depth*height));
    }
    public static void main(String[]test){
        Scanner input = new Scanner(System.in);
        Main box = new Main();
        System.out.print("Enter the width of the box: ");
        box.width= input.nextInt();
        System.out.print("Enter the heigth of the box: ");
        box.height = input.nextInt();
        System.out.print("Enter the depth of the box: ");
        box.depth = input.nextInt();
        box.volume();
    }
}   
