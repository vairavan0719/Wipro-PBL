import java.util.*;
public class Main {
    public static void main(String[]test){
        TreeSet <String> ts1 = new TreeSet<String>();
        ts1.add("Vijay");
        ts1.add("Ajith");
        ts1.add("Dhanush");
        ts1.add("Sivakarthikayan");
        System.out.print("Given set:"+ts1+"\n");
        System.out.print("Descending set: "+ts1.descendingSet()+"\n");
        Iterator i = ts1.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.print("\n");
        System.out.print(ts1.contains("Vijay"));
        
    }
}