import java.util.*;
public class Main3{
public static void main(String[]test){
Scanner input = new Scanner(System.in);
Main1 a = new Main1();
String c = input.nextLine();
        String b[]=c.split(",");
         String un=b[0];
        String uc = b[1];
a.Reguser(un,uc);

}
}