interface vehicle{
    default void message(){
    System.out.print("Inside vehicle");
    }
}
interface fourWheller{
    default void message(){
        System.out.print("Inside four wheller");
    }
}
public class Main implements vehicle,fourWheller{
   public void message(){
       fourWheller.super.message();
   } 
public static void main(String[]test){
    Main a= new Main();
    a.message();
}
}