import java.util.*;
public class Main{
    public enum integers{one,two,three,four,five,six}//enum is only foe strings 
    public static void main(String[]test){
        Vector l1 = new Vector(3,2);
        l1.add(10);// we can use add or addElement
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
    System.out.print(l1);
    System.out.print("\n");
    System.out.print(l1.contains(10));
    System.out.print("\n");
        Iterator i = l1.iterator();//it is like while loop
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.print("\n");
        ListIterator j = l1.listIterator();
        while(j.hasNext()){
            System.out.print(j.next()+" ");
        }
        System.out.print("\n");
        for(integers k : integers.values())
        System.out.print(k+" ");    
        
    }
}