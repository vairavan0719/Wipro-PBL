import java.util.*;
public class Main{
    public static void main(String[]test){
        ArrayList <String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Mango");
        list1.add("Banana");
        list1.add("Kivi");
    Iterator l1 = list1.iterator();
    while(l1.hasNext()){
        System.out.print(l1.next()+" ");
    }
    }
    
}