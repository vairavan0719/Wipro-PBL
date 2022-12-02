import java.util.*;
public class Main{
    HashSet <String>hs1 = new HashSet<String>();
    void addCountry(String cn){
        hs1.add(cn);
        System.out.print(cn+" added successfully"+"\n");
    }
    void findCountry(String cn){
        if(hs1.contains(cn)== true){
       System.out.print(cn+" is present in the given set \n");
        }
        else{
            System.out.print(cn+" is not found in the given set \n");
        }
    }
    void printAllCountry(){
        Iterator i = hs1.iterator();
        while(i.hasNext()){
        System.out.print(i.next()+" ");
    }
    System.out.print("\n");
    }
    public static void main(String[]test){
    Main a = new Main();
    a.addCountry("India");
    a.addCountry("India");
    a.addCountry("America");
    a.addCountry("England");
    a.findCountry("India");
    a.findCountry("Africa");
    a.printAllCountry();
    }
}