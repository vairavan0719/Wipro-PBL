import com.wipro.automobile.ship.Compartment;
public class Main{
    public static void main(String[]test){
        Compartment a = new Compartment();
      a.display();
        System.out.print("Height of the ship: "); 
        System.out.print(a.h+"\n");
        System.out.print("Width of the ship: ");
        System.out.print(a.w+"\n");
        System.out.print("Breadth of the ship: ");
        System.out.print(a.b+"\n");
    }
}
